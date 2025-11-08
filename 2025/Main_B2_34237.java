import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken()), M=Integer.parseInt(st.nextToken());
        int [][] bet = new int [N][2];
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            bet[i][0]=Integer.parseInt(st.nextToken());
            bet[i][1]=Integer.parseInt(st.nextToken());
        }
        for(int i=0;i<M;i++){
            st = new StringTokenizer(br.readLine());
            int g = Integer.parseInt(st.nextToken()), ans=0;
            int x = Integer.parseInt(st.nextToken()), y = Integer.parseInt(st.nextToken());
            for(int j=0;j<N;j++){
                int left = g-x-y;
                if(g >= bet[j][0]+bet[j][1] && bet[j][0]>=x && bet[j][1]>=y){
                    if(bet[j][0] <= x+left ) {
                        left-=bet[j][0]-x;
                        if (bet[j][1] <=y + left)
                            ans++;
                    }
                }
            }
            System.out.println(ans);
        }
    }
}