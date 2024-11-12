import java.util.*;
public class Main {
    static boolean [][] map;
    static int N, M;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N=sc.nextInt();
        M=sc.nextInt();
        int K=sc.nextInt(), ans=0;
        map = new boolean[N][M];
        for(int i=0;i<K;i++)
            map[sc.nextInt()-1][sc.nextInt()-1]=true;
        for(int i=0;i<N;i++)
            for(int j=0;j<M;j++)
                if(map[i][j])
                    ans=Math.max(BFS(i,j),ans);
        System.out.println(ans);
    }

    public static int BFS(int x, int y){
        int [] dx = new int [] {-1,1,0,0}, dy = new int[] {0,0,-1,1};
        int ret=1;
        Queue<int []> q = new LinkedList<>();
        q.add(new int []{x,y});
        map[x][y]=false;
        while(q.size()>0) {
            int [] cur=q.poll();
            x=cur[0];
            y=cur[1];
            for(int i=0;i<4;i++){
                int nx=x+dx[i], ny=y+dy[i];
                if(nx>=0 && nx<N && ny>=0 && ny<M)
                    if(map[nx][ny]) {
                        q.add(new int [] {nx, ny});
                        map[nx][ny]=false;
                        ret++;
                    }
            }
        }
        return ret;
    }
}
