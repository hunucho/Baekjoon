import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken()), M=Integer.parseInt(st.nextToken()), ans=0;
        char [][] map = new char[N][M];
        int [] dx = new int [] {1,0,-1,0}, dy = new int [] {0,1,0,-1};
        boolean [][] chk = new boolean[N][M];
        Queue<int []> q = new LinkedList<>();

        for(int i=0;i<N;i++){
            String tmp = br.readLine();
            for(int j=0;j<M;j++) {
                map[i][j] = tmp.charAt(j);
                if (map[i][j] == 'I') {
                    q.add(new int [] {i,j});
                    chk[i][j]=true;
                }
            }
        }

        while(q.size()>0){
            int x=q.peek()[0],y=q.poll()[1];
            for(int i=0;i<4;i++){
                int nx = x+dx[i], ny = y+dy[i];
                if(nx<0 || nx>=N || ny<0 || ny>=M || chk[nx][ny])
                    continue;
                if(map[nx][ny]!='X') {
                    if(map[nx][ny]=='P')
                        ans++;
                    chk[nx][ny]=true;
                    q.add(new int[]{nx,ny});
                }
            }
        }
        System.out.println(ans==0?"TT":ans);
    }
}
