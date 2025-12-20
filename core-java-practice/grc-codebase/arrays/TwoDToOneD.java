import java.util.*;

public class TwoDToOneD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] arr2 = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        int[] arr1 = new int[rows * cols];
        int index = 0;



        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr1[index] = arr2[i][j];
                index++;
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }


    }
}
