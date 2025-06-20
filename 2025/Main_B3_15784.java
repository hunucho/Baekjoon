import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken()), a=Integer.parseInt(st.nextToken()), b=Integer.parseInt(st.nextToken());
        int [][] arr = new int [N+1][N+1];
        for(int i=1;i<=N;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=1;j<=N;j++)
                arr[i][j]=Integer.parseInt(st.nextToken());
        }
        boolean ans=true;
        for(int i=1;i<=N;i++){
            if(arr[a][i]>arr[a][b] || arr[i][b]>arr[a][b])
                ans=false;
        }
        System.out.println(ans?"HAPPY":"ANGRY");
    }
}
