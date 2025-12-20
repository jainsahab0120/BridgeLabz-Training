import java.util.*;

public class CountRocketLaunchUsingWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        while (cnt >= 1) {
            System.out.println(cnt);
            cnt--;
        }
    }
}
