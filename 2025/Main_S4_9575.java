import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for(int t=0;t<T;t++){
            int [] brr = new int [3];
            int [][] arr = new int [3][];
            HashSet<Integer> hs = new HashSet<>();
            for(int i=0;i<3;i++){
                int N=Integer.parseInt(br.readLine());
                brr[i]=N;
                arr[i] = new int [N];
                StringTokenizer st = new StringTokenizer(br.readLine());
                for(int j=0;j<N;j++)
                    arr[i][j]=Integer.parseInt(st.nextToken());
            }
            for(int i=0;i<brr[0];i++){
                for(int j=0;j<brr[1];j++){
                    for(int k=0;k<brr[2];k++){
                        int tmp = arr[0][i]+arr[1][j]+arr[2][k];
                        if(isLucky(tmp))
                            hs.add(tmp);
                    }
                }
            }
            sb.append(hs.size()).append("\n");
        }
        System.out.print(sb);
    }
    public static boolean isLucky(int N){
        if(N==0)
            return false;
        while(N>0){
            int mod = N%10;
            if(!(mod==5 || mod==8))
                return false;
            N/=10;
        }
        return true;
    }
}