import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int [][] S = new int [N][N];
        int A = 0;
        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0;j<N;j++)
                S[i][j]=Integer.parseInt(st.nextToken());
        }
        if(N==2){
            System.out.print(1+" "+(S[0][1]-1));
        } else {
            StringBuilder sb = new StringBuilder();
            A = (S[0][1] + S[0][2] - S[1][2])/2;
            sb.append(A).append(" ");
            for(int i=1;i<N;i++)
                sb.append(S[0][i]-A).append(" ");
            System.out.print(sb);
        }
    }
}