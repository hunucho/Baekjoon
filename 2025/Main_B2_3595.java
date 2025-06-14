import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        int area=Integer.MAX_VALUE;
        String ans = "";
        for(int a=N;a>=1;a--) {
            if (N % a == 0) {
                for (int b = N / a; b >= 1; b--) {
                    if ((N / a) % b == 0) {
                        for (int c = N/a/b; c >= 1; c--) {
                            int tmp = 2*(a*b + b*c + c*a);
                            if (a * b * c == N && tmp < area) {
                                area = tmp;
                                ans = String.format("%d %d %d", a, b, c);
                            }
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
