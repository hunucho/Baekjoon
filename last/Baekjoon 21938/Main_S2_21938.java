import java.io.*;
import java.util.*;
public class Main {
    static boolean [][] videos;
    static int [] dx, dy;
    static int N, M;
    public static void main(String[] args) throws Exception{
        input();
        int ans=0;
        for(int i=0;i<N;i++)
            for(int j=0;j<M;j++)
                ans+=DFS(i,j);
        System.out.println(ans);
    }

    public static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        double [][] tmp = new double [N][M];
        videos = new boolean [N][M];
        dx = new int [] {-1, 1, 0, 0};
        dy = new int [] {0, 0, -1, 1};
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<M;j++){
                for(int k=0;k<3;k++)
                    tmp[i][j]+=Integer.parseInt(st.nextToken());
                tmp[i][j]/=3;
            }
        }
        int T = Integer.parseInt(br.readLine());
        for(int i=0;i<N;i++)
            for(int j=0;j<M;j++)
                if(tmp[i][j]>=T)
                    videos[i][j]=true;
    }

    public static int DFS(int x, int y){
        if(!videos[x][y])
            return 0;
        videos[x][y]=false;
        for(int i=0;i<4;i++){
            int nx = x + dx[i], ny = y + dy[i];
            if(nx>=0 && nx<N && ny>=0 && ny<M)
                DFS(nx, ny);
        }
        return 1;
    }
}
