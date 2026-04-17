import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        String S = st.nextToken().replace('?', '9'), ans=S;
        String A = br.readLine();
        if(N<A.length()){
            ans = "-1";
        } else if(N==A.length()){
            for(int i=0;i<N;i++){
                if(S.charAt(i)>A.charAt(i)) {
                    break;
                } else if(S.charAt(i)<A.charAt(i)) {
                    ans="-1";
                    break;
                }
            }
        }
        System.out.print(ans);
    }
}