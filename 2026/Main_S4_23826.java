import java.io.*;
import java.util.*;

public class Main {
    static int X, Y, E;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        int N = Integer.parseInt(br.readLine()), ans=0;
        st = new StringTokenizer(br.readLine());
        X = Integer.parseInt(st.nextToken());
        Y = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());
        int [][] arr = new int [N][3];
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<3;j++)
                arr[i][j]=Integer.parseInt(st.nextToken());
        }
        for(int i=0;i<N;i++){
            int tmp = E-getDist(X, Y, arr[i][0], arr[i][1]);
            if(tmp<=0)
                continue;
            for(int j=0;j<N;j++){
                tmp-=Math.max(0, arr[j][2]-getDist(arr[i][0], arr[i][1], arr[j][0], arr[j][1]));
            }
            ans = Math.max(ans, tmp);
        }
        System.out.print(ans==0?"IMPOSSIBLE":ans);
    }

    static int getDist(int x1, int y1, int x2, int y2){
        return Math.max(0, (Math.abs(x1-x2) + Math.abs(y1-y2)));
    }
}