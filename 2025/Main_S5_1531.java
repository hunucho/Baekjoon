import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken()), M=Integer.parseInt(st.nextToken());
        int [][] arr = new int [101][101];
        for(int t=0;t<N;t++){
            st = new StringTokenizer(br.readLine());
            int sx=Integer.parseInt(st.nextToken()), sy=Integer.parseInt(st.nextToken());
            int ex=Integer.parseInt(st.nextToken()), ey=Integer.parseInt(st.nextToken());
            for(int i=sx;i<=ex;i++)
                for(int j=sy;j<=ey;j++)
                    arr[i][j]++;
        }
        int ans=0;
        for(int i=1;i<=100;i++)
            for(int j=1;j<=100;j++)
                if(arr[i][j]>M)
                    ans++;
        System.out.print(ans);
    }
}