import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine()), ans=0;
        boolean [] flowers = new boolean[1000001];
        for(int i=0;i<N;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken()), c = Integer.parseInt(st.nextToken());
            if(!(flowers[a]||flowers[b]||flowers[c]))
                ans++;
            flowers[a]=flowers[b]=flowers[c]=true;
        }
        System.out.print(ans);
    }
}