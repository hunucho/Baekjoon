import java.io.*;
import java.util.*;

public class Main {
    static int N, M;
    static int [][] arr;

    public static void main(String[] args) throws  Exception {
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        M=sc.nextInt();
        arr = new int [N][M];
        for(int i=0;i<N;i++)
            for(int j=0;j<M;j++)
                arr[i][j]=sc.nextInt();
        int ans=0;
        for(int i=0;i<M-2;i++) {
            for (int j = i + 1; j < M - 1; j++) {
                for (int k = j + 1; k < M; k++) {
                    int tmp=0;
                    for(int l=0;l<N;l++)
                        tmp+=getMax(l, i, j, k);
                    ans=Math.max(ans, tmp);
                }
            }
        }
        System.out.print(ans);
    }

    public static int getMax(int r, int c1, int c2, int c3){
        return Math.max(arr[r][c1], Math.max(arr[r][c2], arr[r][c3]));
    }
}
