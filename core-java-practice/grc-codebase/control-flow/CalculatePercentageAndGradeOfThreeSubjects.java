import java.util.*;

public class CalculatePercentageAndGradeOfThreeSubjects {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int phy = sc.nextInt();
        int chem = sc.nextInt();
        int maths = sc.nextInt();
        double aver = (phy + chem + maths) / 3.0;
        char grade;
        String remark;

        if (aver >= 80) {
            grade = 'A';
            remark = "Level 4, above agency-normalized standards";
        }
        else if (aver >= 70) {
            grade = 'B';
            remark = "Level 3, at agency-normalized standards";
        }
        else if (aver >= 60) {
            grade = 'C';
            remark = "Level 2, below but approaching agency-normalized standards";
        }
        else if (aver >= 50) {
            grade = 'D';
            remark = "Level 1, well below agency-normalized standards";
        }
        else if (aver >= 40) {
            grade = 'E';
            remark = "Level 1-, too below agency-normalized standards";
        }
        else {
            grade = 'R';
            remark = "Remedial standards";
        }

        System.out.println("Average Percentage: " + aver);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remark);
    }
}
