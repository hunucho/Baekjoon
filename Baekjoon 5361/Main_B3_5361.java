import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        double [] arr = new double [] {350.34, 230.90, 190.55, 125.30, 180.90};
        for (int t = 0; t < T; t++) {
            double ans=0;
            for (int j = 0; j < 5; j++)
                ans += arr[j] * sc.nextInt();
            System.out.printf("$%.2f\n",ans);
        }
    }
}
