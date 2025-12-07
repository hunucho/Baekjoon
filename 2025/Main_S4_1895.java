import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int R = Integer.parseInt(st.nextToken()), C = Integer.parseInt(st.nextToken());
        int [][] img = new int [R][C];
        for(int i=0;i<R;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<C;j++)
                img[i][j]=Integer.parseInt(st.nextToken());
        }
        int T = Integer.parseInt(br.readLine()), ans=0;
        for(int i=1;i<R-1;i++){
            for(int j=1;j<C-1;j++){
                int [] tmp = new int [9];
                int cnt=0;
                for(int k=-1;k<=1;k++){
                    for(int l=-1;l<=1;l++) {
                        tmp[cnt++]=img[i+k][j+l];
                    }
                }
                Arrays.sort(tmp);
                if(tmp[4]>=T)
                    ans++;
            }
        }
        System.out.print(ans);
    }
}