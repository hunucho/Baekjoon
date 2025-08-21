import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        for(int t=1;t<=T;t++){
            int ans=sc.nextInt();
            for(int i=0;i<4;i++){
                int tmp=sc.nextInt();
                ans=Math.max(ans, tmp);
            }
            System.out.printf("Case #%d: %d\n", t, ans);
        }
    }
}