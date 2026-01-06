import java.util.ArrayList;
import java.util.List;

class InvalidMarkException extends Exception {
    InvalidMarkException(String msg) {
        super(msg);
    }
}

class Student {
    String name;
    String[] subjects;
    int[] marks;

    Student(String name, String[] subjects, int[] marks) throws InvalidMarkException {
        this.name = name;
        this.subjects = subjects;
        this.marks = marks;

        if (subjects.length != marks.length) {
            throw new InvalidMarkException("Subjects and marks count mismatch");
        }

        for (int m : marks) {
            if (m < 0 || m > 100) {
                throw new InvalidMarkException("Marks must be between 0 and 100");
            }
        }
    }

    double getAverage() {
        int sum = 0;
        for (int m : marks) {
            sum += m;
        }
        return sum / (double) marks.length;
    }

    String getGrade(double avg) {
        if (avg >= 80) return "A";
        if (avg >= 60) return "B";
        if (avg >= 40) return "C";
        return "Fail";
    }

    void printReport() {
        double avg = getAverage();
        System.out.println("\nStudent : " + name);

        for (int i = 0; i < subjects.length; i++) {
            System.out.println(subjects[i] + " -> " + marks[i]);
        }

        System.out.println("Average : " + String.format("%.2f", avg));
        System.out.println("Grade   : " + getGrade(avg));
    }
}

public class StudentReportGenerator {

    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();
        String[] subjects = {"Maths", "Science", "English"};

        try {
            list.add(new Student("Rahul", subjects, new int[]{78, 85, 69}));
            list.add(new Student("Anita", subjects, new int[]{92, 88, 95}));

            for (Student s : list) {
                s.printReport();
            }

        } catch (InvalidMarkException e) {
            System.out.println("Invalid data: " + e.getMessage());
        }
    }
}
