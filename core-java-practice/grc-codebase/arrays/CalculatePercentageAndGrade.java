import java.util.*;

public class CalculatePercentageAndGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        double[] phymarks = new double[num];
        double[] chemMarks = new double[num];
        double[] mathsMarks = new double[num];
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
            phymarks[i] = p;
            chemMarks[i] = c;
            mathsMarks[i] = m;
        }
        for (int i = 0; i < num; i++) {
            double anss = phymarks[i] + chemMarks[i] + mathsMarks[i];
            percentage[i] = anss / 3;

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
            
            System.out.println(phymarks[i]);
            System.out.println(chemMarks[i]);
            System.out.println(mathsMarks[i]);
            System.out.println(percentage[i]);
            System.out.println(grade[i]);
        }
    }
}
