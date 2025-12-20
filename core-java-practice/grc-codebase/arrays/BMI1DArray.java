import java.util.*;

public class BMI1DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        double[] wt = new double[num];
        double[] ht = new double[num];
        double[] bmi = new double[num];
        String[] status = new String[num];

        for (int i = 0; i < num; i++) {
            wt[i] = sc.nextDouble();
            ht[i] = sc.nextDouble();
        }
        for (int i = 0; i < num; i++) {
            bmi[i] = wt[i] / (ht[i] * ht[i]);

            if (bmi[i] <= 18.4) {
                status[i] = "Underweight";
            }
            else if (bmi[i] <= 24.9) {
                status[i] = "Normal";
            }
            else if (bmi[i] <= 39.9) {
                status[i] = "Overweight";
            }
            else {
                status[i] = "Obese";
            }
        }
        for (int i = 0; i < num; i++) {
            
            System.out.println(ht[i]);
            System.out.println(wt[i]);
            System.out.println(bmi[i]);
            System.out.println(status[i]);
        }


    }
}
