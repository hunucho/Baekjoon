import java.io.*;
import java.util.*;

class Main {

    static int R, C, Dx, Dy, Sx, Sy;
    static char [][] map;
    static int [][] water;
    static boolean [][] visited;
    static Queue<int []> qw, qs;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R=Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        map = new char [R][C];
        visited = new boolean[R][C];
        water = new int [R][C];
        qw = new LinkedList<>();
        qs = new LinkedList<>();
        for(int i=0;i<R;i++) {
            map[i] = br.readLine().toCharArray();
            for (int j = 0; j < C; j++) {
                if (map[i][j] == '*') {
                    qw.add(new int[]{i, j, 1});
                    water[i][j]=1;
                } else if (map[i][j] == 'D') {
                    Dx = i;
                    Dy = j;
                } else if (map[i][j] == 'S') {
                    qs.add(new int [] {i, j, 1});
                    visited[i][j]=true;
                    Sx = i;
                    Sy = j;
                }
            }
        }

        int ans=BFS();
        System.out.println(ans==-1?"KAKTUS":ans);

    }

    static int BFS() {
        int ret = -1;
        int [] dx = {-1, 1, 0, 0}, dy = {0, 0, -1, 1};
        int time=1;
        while(qw.size()>0) {
            int[] cur = qw.poll();
            int curx = cur[0], cury = cur[1], curcnt = cur[2];
            for (int i = 0; i < 4; i++) {
                int nx = curx + dx[i], ny = cury + dy[i], ncnt = curcnt + 1;
                if (nx >= 0 && nx < R && ny >= 0 && ny < C) {
                    if ((map[nx][ny] != 'X' && map[nx][ny]!='D') && water[nx][ny]==0) {
                        water[nx][ny] = ncnt;
                        qw.add(new int[]{nx, ny, ncnt});
                    }
                }
            }
        }

        while(qs.size()>0) {
            int[] cur = qs.poll();
            int curx = cur[0], cury = cur[1], curcnt = cur[2];
            if (map[curx][cury] == '*')
                continue;
            for (int i = 0; i < 4; i++) {
                int nx = curx + dx[i], ny = cury + dy[i], ncnt = curcnt + 1;
                if (nx >= 0 && nx < R && ny >= 0 && ny < C) {
                    if (nx == Dx && ny == Dy)
                        return curcnt;
                    if (map[nx][ny] == '.' && (water[nx][ny] == 0 || water[nx][ny] > ncnt) && !visited[nx][ny]) {
                        visited[nx][ny]=true;
                        qs.add(new int[]{nx, ny, ncnt});
                    }
                }
            }

        }

        return ret;
    }
}