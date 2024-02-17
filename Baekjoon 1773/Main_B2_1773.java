import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken()), C=Integer.parseInt(st.nextToken());
        boolean [] chk = new boolean[C+1];
        for(int i=0;i<N;i++){
            int fire = Integer.parseInt(br.readLine());
            for(int j=fire;j<=C;j+=fire)
                chk[j]=true;
        }
        int ans=0;
        for(int i=0;i< chk.length;i++)
            if(chk[i])
                ans++;
        System.out.println(ans);
    }
}