import java.util.*;
public class Main {
    static int [][] map, arr;
    static int N, M;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N=sc.nextInt();
        M=sc.nextInt();
        map = new int[N][M];
        arr = new int[N][M];
        int ans=0;
        for(int i=0;i<N;i++){
            Arrays.fill(arr[i],999);
            for(int j=0;j<M;j++)
                map[i][j]=sc.nextInt();
        }
        for(int i=0;i<N;i++)
            for(int j=0;j<M;j++)
                if(map[i][j]==1)
                    BFS(i,j);
        for(int i=0;i<N;i++)
            for(int j=0;j<M;j++)
                ans=Math.max(ans, arr[i][j]);
        System.out.println(ans);
    }

    public static void BFS(int x, int y){
        int [] dx = new int [] {-1,-1,-1,0,0,1,1,1}, dy = new int[] {-1,0,1,-1,1,-1,0,1};
        Queue<int []> q = new LinkedList<>();
        q.add(new int []{x,y,0});
        arr[x][y]=0;
        while(q.size()>0) {
            int [] cur=q.poll();
            x=cur[0];
            y=cur[1];
            int cnt=cur[2];
            for(int i=0;i<8;i++){
                int nx=x+dx[i], ny=y+dy[i];
                if(nx>=0 && nx<N && ny>=0 && ny<M)
                    if(arr[nx][ny]>cnt+1) {
                        arr[nx][ny]=cnt+1;
                        q.add(new int [] {nx, ny, cnt+1});
                    }
            }
        }
    }
}
