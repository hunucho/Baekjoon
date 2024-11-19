import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int N=Integer.parseInt(st.nextToken()), M=Integer.parseInt(st.nextToken());
        int [][] arr = new int [N+1][M+1], brr = new int [N+1][M+1];
        for(int i=1;i<=N;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=1;j<=M;j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                brr[i][j] += arr[i][j]+brr[i][j-1];
            }
        }
        int K=Integer.parseInt(br.readLine());
        for(int k=0;k<K;k++){
            st = new StringTokenizer(br.readLine());
            int x1=Integer.parseInt(st.nextToken()), y1=Integer.parseInt(st.nextToken()), x2=Integer.parseInt(st.nextToken()), y2=Integer.parseInt(st.nextToken());
            int ans=0;
            for(int i=x1;i<=x2;i++){
                ans+=brr[i][y2]-brr[i][y1-1];
            }
            sb.append(ans).append("\n");
        }
        System.out.println(sb.toString());


    }
}