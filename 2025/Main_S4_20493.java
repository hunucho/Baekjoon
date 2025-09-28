import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken()), T=Integer.parseInt(st.nextToken());
        int x=0, y=0, dir=0, last=0;
        int [] dx = {1, 0, -1, 0}, dy = {0, -1, 0, 1};
        for(int n=0;n<N;n++){
            st = new StringTokenizer(br.readLine());
            int Ti=Integer.parseInt(st.nextToken());
            x+=dx[dir] * (Ti-last);
            y+=dy[dir] * (Ti-last);
            last = Ti;

            String S=st.nextToken();
            if(S.compareTo("left")==0)
                dir = (dir+3)%4;
            else if(S.compareTo("right")==0)
                dir = (dir+1)%4;
        }
        if(last<T){
            x+=dx[dir] * (T-last);
            y+=dy[dir] * (T-last);
        }
        System.out.print(x+" "+y);
    }
}