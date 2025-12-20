import java.util.*;

public class YoungestBetweenThreeFriends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] friendsName = {"Amar", "Akbar", "Anthony"};
        int[] friendsAge = new int[3];
        double[] friendsHeight = new double[3];

        for (int i = 0; i < 3; i++) {
            friendsAge[i] = sc.nextInt();
            friendsHeight[i] = sc.nextDouble();

        }


        int youngestIndex = 0;
        int tallestIndex = 0;

        for (int i = 1; i < 3; i++) {
            if (friendsAge[i] < friendsAge[youngestIndex]) {
                youngestIndex = i;
            }

            if (friendsHeight[i] > friendsHeight[tallestIndex]) {
                tallestIndex = i;
            }
        }
        System.out.println(friendsName[youngestIndex]);
        System.out.println(friendsName[tallestIndex]);

        
    }
}
