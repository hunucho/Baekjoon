import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt(), M=sc.nextInt(), K=sc.nextInt();
        
        int [][] arr = new int [20][20];
        for(int i=0;i<20;i++)
        	arr[i][0]=arr[0][i]=1;
        
        
        if(K==0) {
        	K=1;
        }
        K--;
        for(int i=1;i<=15;i++){
            for(int j=1;j<=15;j++)
                arr[i][j] = arr[i-1][j]+arr[i][j-1];
        }
        System.out.println(arr[K/M][K%M] * arr[N-(K/M)-1][M-(K%M)-1]);
    }
}
