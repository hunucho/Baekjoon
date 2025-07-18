import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken()), N=Integer.parseInt(st.nextToken());
        int [] dx = {0, 1, 0, -1}, dy = {1, 0, -1, 0};
        int dir=0, x=0, y=0;
        boolean out = false;
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            String Command = st.nextToken();
            int d = Integer.parseInt(st.nextToken());
            if(Command.compareTo("TURN")==0){
                if(d==0)
                    dir = (dir+1)%4;
                else
                    dir = dir-1<0?3:dir-1;
            }
            else {
                x+=dx[dir]*d;
                y+=dy[dir]*d;
            }
            if(x>M || y>M || x<0 || y<0) {
                out = true;
                break;
            }

        }
        System.out.println(out?-1:y+" "+x);
    }
}