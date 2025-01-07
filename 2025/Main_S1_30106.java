import java.util.*;
import java.io.*;
public class Main {
    static int N, M, K;
    static int [][] map;
    static boolean [][] isVisited;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N=Integer.parseInt(st.nextToken());
        M=Integer.parseInt(st.nextToken());
        K=Integer.parseInt(st.nextToken());
        map = new int [N][M];
        isVisited = new boolean [N][M];
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<M;j++)
                map[i][j]=Integer.parseInt(st.nextToken());
        }
        int ans=0;
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++)
                ans+=BFS(i, j);
        }
        System.out.println(ans);
    }
    public static int BFS(int x, int y){
        if(isVisited[x][y])
            return 0;
        int [] dx = {-1, 1, 0, 0}, dy = {0, 0, 1, -1};
        Queue<int []> q = new LinkedList<>();
        q.add(new int [] {x, y, map[x][y]});
        isVisited[x][y]=true;
        while(q.size()>0){
            int [] cur = q.poll();
            x = cur[0];
            y = cur[1];
            int z = cur[2];
            for(int i=0;i<4;i++){
                int nx = x+dx[i], ny = y+dy[i];
                if(nx<0 || nx>=N || ny<0 || ny>=M)
                    continue;;
                if(!isVisited[nx][ny] && Math.abs(map[nx][ny]-z)<=K){
                    isVisited[nx][ny]=true;
                    q.add(new int [] {nx, ny, map[nx][ny]});
                }
            }
        }
        return 1;
    }
}