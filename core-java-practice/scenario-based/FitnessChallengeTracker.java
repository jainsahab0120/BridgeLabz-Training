import java.util.*;

public class FitnessChallengeTracker {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] weeklyPushUps = new int[7];
        for (int i = 0; i < weeklyPushUps.length; i++) {
            weeklyPushUps[i] = input.nextInt();
        }

        int total = 0;
        int activeDays = 0;

        for (int count : weeklyPushUps) {
            if (count == 0) {
                continue;
            }
            total += count;
            activeDays++;
        }

        double average = activeDays == 0 ? 0 : (double) total / activeDays;

        System.out.println(total);
        System.out.println(average);
    }
}
