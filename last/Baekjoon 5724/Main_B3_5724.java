import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        while((N=sc.nextInt())!=0) {
            int ans = 0;
            for (int i = 1; i <= N; i++)
                ans += i * i;
            System.out.println(ans);
        }
    }
}