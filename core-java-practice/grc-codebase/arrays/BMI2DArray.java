import java.util.*;

public class BMI2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        double[][] personData = new double[num][3];
        String[] weightStatus = new String[num];

        for (int i = 0; i < num; i++) {
            double wt = sc.nextDouble();
            double ht = sc.nextDouble();
            if (wt <= 0 || ht <= 0) {
                i--;
                continue;
            }
            personData[i][0] = ht;
            personData[i][1] = wt;
        }
        for (int i = 0; i < num; i++) {
            double ht = personData[i][0];
            double wt = personData[i][1];
            double bmi = wt / (ht * ht);
            personData[i][2] = bmi;

            if (bmi <= 18.4) {
                weightStatus[i] = "Underweight";
            }
            else if (bmi <= 24.9) {
                weightStatus[i] = "Normal";
            }
            else if (bmi <= 39.9) {
                weightStatus[i] = "Overweight";
            }
            else {
                weightStatus[i] = "Obese";
            }
        }

        for (int i = 0; i < num; i++) {

            System.out.println(personData[i][0]);
            System.out.println(personData[i][1]);
            System.out.println(personData[i][2]);
            System.out.println(weightStatus[i]);
        }

        
    }
}
