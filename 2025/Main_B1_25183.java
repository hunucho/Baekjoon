import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        String S = sc.next();
        int cnt=1, max=0;
        for(int i=0;i<N-1;i++){
            if(Math.abs(S.charAt(i)-S.charAt(i+1))==1)
                cnt++;
            else
                cnt=1;
            max = Math.max(max, cnt);
        }
        System.out.println(max>=5?"YES":"NO");
    }
}