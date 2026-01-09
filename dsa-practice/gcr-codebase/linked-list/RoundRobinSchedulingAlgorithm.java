import java.util.*;

// Node representing a CPU job
class JobNode {
    int jobId;
    int remainingTime;
    int priority;
    JobNode link;

    JobNode(int jobId, int time, int priority) {
        this.jobId = jobId;
        this.remainingTime = time;
        this.priority = priority;
        this.link = this; // circular link
    }
}

public class RoundRobinScheduler {

    static JobNode start = null;

    public static void main(String[] args) {

        int timeSlice = 3;

        insertJob(1, 10, 1);
        insertJob(2, 5, 2);
        insertJob(3, 8, 1);

        int[] initialTime = {10, 5, 8};
        int[] finishTime = new int[3];
        int currentTime = 0;

        System.out.println("Initial Ready Queue:");
        printQueue();

        JobNode pointer = start;

        while (start != null) {

            int workDone = Math.min(pointer.remainingTime, timeSlice);
            pointer.remainingTime -= workDone;
            currentTime += workDone;

            System.out.println("Running Job " + pointer.jobId +
                    " for " + workDone + " units");

            if (pointer.remainingTime == 0) {
                finishTime[pointer.jobId - 1] = currentTime;
                System.out.println("Job " + pointer.jobId + " finished");

                int completedJob = pointer.jobId;
                pointer = pointer.link;
                deleteJob(completedJob);
            } else {
                pointer = pointer.link;
            }

            System.out.println("Queue Status:");
            printQueue();
        }

        int[] tat = new int[3];
        int[] wt = new int[3];

        for (int i = 0; i < 3; i++) {
            tat[i] = finishTime[i];
            wt[i] = tat[i] - initialTime[i];
        }

        double avgWT = 0, avgTAT = 0;
        System.out.println("\nFinal Scheduling Results:");

        for (int i = 0; i < 3; i++) {
            System.out.println("Job " + (i + 1) +
                    " | Waiting Time: " + wt[i] +
                    " | Turnaround Time: " + tat[i]);
            avgWT += wt[i];
            avgTAT += tat[i];
        }

        System.out.println("Average Waiting Time = " + (avgWT / 3));
        System.out.println("Average Turnaround Time = " + (avgTAT / 3));
    }

    // Add job to circular list
    static void insertJob(int id, int time, int priority) {
        JobNode node = new JobNode(id, time, priority);

        if (start == null) {
            start = node;
            return;
        }

        JobNode temp = start;
        while (temp.link != start) {
            temp = temp.link;
        }
        temp.link = node;
        node.link = start;
    }

    // Remove completed job
    static void deleteJob(int id) {
        if (start == null) return;

        JobNode curr = start;
        JobNode prev = null;

        do {
            if (curr.jobId == id) {

                if (prev == null) {
                    if (start.link == start) {
                        start = null;
                        return;
                    }

                    JobNode last = start;
                    while (last.link != start) {
                        last = last.link;
                    }
                    last.link = start.link;
                    start = start.link;
                } else {
                    prev.link = curr.link;
                }
                return;
            }

            prev = curr;
            curr = curr.link;
        } while (curr != start);
    }

    // Display queue
    static void printQueue() {
        if (start == null) {
            System.out.println("Ready queue empty");
            return;
        }

        JobNode temp = start;
        do {
            System.out.print("[Job " + temp.jobId +
                    " | Remaining: " + temp.remainingTime + "] -> ");
            temp = temp.link;
        } while (temp != start);

        System.out.println("(circular)");
    }
}
