import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken()), M=Integer.parseInt(st.nextToken());
        char [][] map = new char [N][M];
        for(int i=0;i<N;i++)
            map[i]=br.readLine().toCharArray();
        int [] dx = {-1, 0, 1,0}, dy = {0, 1, 0, -1};
        st = new StringTokenizer(br.readLine());
        int sx = Integer.parseInt(st.nextToken())-1, sy = Integer.parseInt(st.nextToken())-1;
        int ans=0, ansd=0;
        for(int d=0;d<4 && ans!=-1;d++){
            int [][][] arr = new int [N][M][4];
            int x=sx, y=sy, cnt=0, dir=d;
            while(0<=x && x<N && 0<=y && y<M){
                if(map[x][y]=='C')
                    break;
                if(arr[x][y][dir]==2) {
                    ans = -1;
                    ansd = d;
                    break;
                }
                cnt++;
                arr[x][y][dir]++;
                if(map[x][y]=='/'){
                    if(dir==0 || dir==2)
                        dir++;
                    else
                        dir--;
                } else if(map[x][y]=='\\'){
                    dir = 3-dir;
                }
                x += dx[dir];
                y += dy[dir];
            }
            if(ans!=-1){
                if(ans<cnt) {
                    ans = cnt;
                    ansd = d;
                }
            }

        }
        System.out.println("URDL".charAt(ansd));
        System.out.print(ans==-1?"Voyager":ans);
    }
}