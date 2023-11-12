import java.util.*;
public class Main {
    static int N, M, A, B;
    static boolean [][] obstacles, isVisited;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        A = sc.nextInt();
        B = sc.nextInt();
        int K = sc.nextInt(), ans = -1;
        obstacles = new boolean [N][M];
        isVisited = new boolean[N][M];
        Queue<int []> q = new LinkedList<>();

        for(int k=0;k<K;k++){
            int x=sc.nextInt()-1, y=sc.nextInt()-1;
            obstacles[x][y]=true;
        }

        int sx = sc.nextInt()-1, sy = sc.nextInt()-1, ex = sc.nextInt()-1, ey = sc.nextInt()-1;
        isVisited[sx][sy]=true;

        int [] dx = new int [] {-1, 1, 0, 0}, dy = new int [] {0, 0, -1, 1};

        q.add(new int [] {sx, sy, 0});
        while(q.size()>0) {
            int [] cur = q.poll();
            int x = cur[0], y = cur[1], cnt = cur[2];
            if(x==ex && y==ey) {
                ans = cnt;
                break;
            }

            for(int i=0;i<4;i++){
                int nx = x+dx[i], ny = y+dy[i];
                if(nx<0 || nx+A-1>=N || ny<0 || ny+B-1>=M)
                    continue;

                if(isMove(nx, ny, i)) {
                    q.add(new int[]{nx, ny, cnt + 1});
                    isVisited[nx][ny]=true;
                }
            }
        }
        System.out.println(ans);
    }

    public static boolean isMove(int x, int y, int dir) {
        if(isVisited[x][y])
            return false;
        if(dir==0) {
            for (int j = 0; j < B; j++)
                if (obstacles[x][y + j])
                    return false;
        } else if (dir==1) {
            for (int j = 0; j < B; j++)
                if (obstacles[x + A-1][y + j])
                    return false;
        } else if (dir==2) {
            for (int i = 0; i < A; i++)
                if (obstacles[x + i][y])
                    return false;
        } else if(dir==3) {
            for (int i = 0; i < A; i++)
                if (obstacles[x + i][y + B-1])
                    return false;
        }
        return true;
    }
}
