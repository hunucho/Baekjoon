import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken()), m=Integer.parseInt(st.nextToken());
        int [] P = new int[n+1], M = new int[n+1];
        // P : 광합성, M : 운동성
        Arrays.fill(P, -1);
        Arrays.fill(M, -1);
        for(int i=0;i<m;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            char b = st.nextToken().charAt(0);
            int c = Integer.parseInt(st.nextToken());
            if(b=='P')
                P[a]=c;
            else if(b=='M')
                M[a]=c;
        }
        int min=0, max=0;
        for(int i=1;i<=n;i++){
            if(P[i]==1 && M[i]==0)
                min++;
            if(P[i]!=0 && M[i]!=1)
                max++;
        }
        System.out.print(min+" "+max);
    }
}