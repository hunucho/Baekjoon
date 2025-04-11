import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        String S=sc.next().toLowerCase();
        StringBuilder sb = new StringBuilder();
        boolean [] chk = new boolean[26];
        int K=sc.nextInt(), cnt=1;
        char last=S.charAt(0);
        for(int i=1;i<S.length();i++){
            if(last!=S.charAt(i)){
                if(!chk[last-'a']) {
                    if (cnt >= K)
                        sb.append(1);
                    else
                        sb.append(0);
                    chk[last-'a'] = true;
                }
                last = S.charAt(i);
                cnt=1;
            } else
                cnt++;
        }
        if(!chk[last-'a'])
            sb.append(cnt>=K?1:0);
        System.out.println(sb);
    }
}