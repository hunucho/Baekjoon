import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int [][] A = new int [n][n], map = new int [n][n];
        for(int i=0;i<n;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            for(int j=0;j<n;j++) {
                A[i][j] = Integer.parseInt(st.nextToken());
                map[i][j]=999999999;
            }
        }
        map[0][0]=0;
        for(int i=1;i<n;i++) {
            int dif = A[i][0]-A[i-1][0]+1;
            map[i][0] = map[i-1][0] + (dif>=0?dif:0);
        }
        for(int j=1;j<n;j++) {
            int dif = A[0][j]-A[0][j-1]+1;
            map[0][j] = map[0][j-1] + (dif>=0?dif:0);
        }
        for(int i=1;i<n;i++) {
            for(int j=1;j<n;j++){
                int difi = A[i][j]-A[i-1][j]+1, difj = A[i][j]-A[i][j-1]+1;
                map[i][j] = Math.min(map[i-1][j]+(difi>=0?difi:0), map[i][j-1]+(difj>=0?difj:0));
            }
        }
        System.out.print(map[n-1][n-1]);
    }
}