import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine()), ans=0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        long sx=Integer.parseInt(st.nextToken()), sy=Integer.parseInt(st.nextToken()), ex=Integer.parseInt(st.nextToken()), ey = Integer.parseInt(st.nextToken()), max=Long.MAX_VALUE;
        for(int i=1;i<=N;i++){
            long M=Long.parseLong(br.readLine()), curx = sx, cury=sy, tmp=0;
            for(int j=0;j<M;j++){
                st = new StringTokenizer(br.readLine());
                long x=Integer.parseInt(st.nextToken()), y=Integer.parseInt(st.nextToken());
                tmp+=getDist(curx, cury, x, y);
                curx=x;
                cury=y;
            }
            tmp+=getDist(curx, cury, ex, ey);
            if(tmp<=max){
                max=tmp;
                ans=i;
            }
        }
        System.out.println(ans);
    }
    public static long getDist(long sx, long sy, long ex, long ey){
        return Math.abs(ex-sx)+ Math.abs(ey-sy);
    }
}