import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt(), M=sc.nextInt(), K=sc.nextInt();
        int [][] arr = new int [N+2][M+2];
        arr[0][1]=1;
        for(int i=1;i<=K/M+1;i++){
            for(int j=1;j<=K%M;j++)
                arr[i][j] = arr[i-1][j]+arr[i][j-1];
        }
        for(int i=K/M+1;i<=N;i++){
            for(int j= Math.max(1,K%M);j<=M;j++)
                arr[i][j] = arr[i-1][j]+arr[i][j-1];
        }
        System.out.println(arr[N][M]);
    }
}