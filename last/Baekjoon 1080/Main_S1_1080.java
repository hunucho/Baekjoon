import java.io.*;
import java.util.*;

public class Main {
    static boolean [][] arr, brr;
    static int N, M;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new boolean [N][M];
        for(int i=0;i<N;i++){
            String str = br.readLine();
            for(int j=0;j<M;j++)
                arr[i][j]=str.charAt(j)=='1'?true:false;
        }
        brr = new boolean[N][M];
        for(int i=0;i<N;i++){
            String str = br.readLine();
            for(int j=0;j<M;j++)
                brr[i][j]=str.charAt(j)=='1'?true:false;
        }
        System.out.println(greedy());
    }
    public static int greedy() {
        int ans=0;
        if(isMatched())
            return ans;
        for(int i=0;i<N-2;i++){
            for(int j=0;j<M-2;j++){
                if(arr[i][j]!=brr[i][j]){
                    ans++;
                    for(int ii=0;ii<3;ii++)
                        for(int jj=0;jj<3;jj++)
                            arr[i+ii][j+jj]=!arr[i+ii][j+jj];
                }
                if(isMatched())
                    return ans;
            }
        }
        return -1;
    }
    public static boolean isMatched(){
        for(int i=0;i<N;i++)
            for(int j=0;j<M;j++)
                if(arr[i][j]!=brr[i][j])
                    return false;
        return true;
    }
}