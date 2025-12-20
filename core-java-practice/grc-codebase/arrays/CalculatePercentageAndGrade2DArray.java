import java.util.*;

public class CalculatePercentageAndGrade2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        double[][] marks = new double[num][3];
        double[] percentage = new double[num];
        char[] grade = new char[num];

        for (int i = 0; i < num; i++) {
            double p = sc.nextDouble();
            double c = sc.nextDouble();
            double m = sc.nextDouble();

            if (p < 0 || c < 0 || m < 0) {
                i--;
                continue;
            }
            marks[i][0] = p;
            marks[i][1] = c;
            marks[i][2] = m;
        }
        for (int i = 0; i < num; i++) {
            double sum = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = sum / 3;

            if (percentage[i] >= 80) {
                grade[i] = 'A';
            }
            else if (percentage[i] >= 70) {
                grade[i] = 'B';
            }
            else if (percentage[i] >= 60) {
                grade[i] = 'C';
            }
            else if (percentage[i] >= 50) {
                grade[i] = 'D';
            }
            else if (percentage[i] >= 40) {
                grade[i] = 'E';
            }
            else {
                grade[i] = 'R';
            }
        }
        for (int i = 0; i < num; i++) {
            
            System.out.println(marks[i][0]);
            System.out.println(marks[i][1]);
            System.out.println(marks[i][2]);
            System.out.println(percentage[i]);
            System.out.println(grade[i]);
        }
    }
}
