import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int N = sc.nextInt(), ans = 0;
        for (int i = 0; i < N; i++) {
            String R=sc.next();
            for(int j=0;j<R.length();j++) {
                int cnt = S.length();
                for (int k = 0; k < S.length(); k++, cnt--)
                    if (R.charAt((j + k) % R.length()) != S.charAt(k))
                        break;
                if (cnt == 0) {
                    ans++;
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}