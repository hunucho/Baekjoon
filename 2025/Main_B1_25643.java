import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken()), M=Integer.parseInt(st.nextToken());
        int ans=1;
        String last = br.readLine();
        for(int i=1;i<N;i++){
            String cur = br.readLine();
            if(!Valid(last.toCharArray(), cur.toCharArray(), M))
                ans=0;
            last = cur;
        }
        System.out.print(ans);
    }
    public static boolean Valid(char [] last, char [] cur, int M){
        for(int i=-M+1;i<M;i++){
            boolean chk = true;
            for(int j=0;j<M;j++){
                if(0<=i+j && i+j<M && last[j]!=cur[i+j])
                    chk = false;
            }
            if(chk) {
                return true;
            }
        }
        return false;
    }
}
