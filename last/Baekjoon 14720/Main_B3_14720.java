import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), ans = 0;
        for (int i = 0; i < N; i++)
            if (sc.nextInt() == ans % 3)
                ans++;
        System.out.println(ans);
    }
}
