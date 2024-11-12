import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T=Integer.parseInt(br.readLine());
        int [] dx = new int [] {-1,1,0,0}, dy = new int[] {0,0,-1,1};
        Queue<int []> q = new LinkedList<>();
        char[][] sheep = new char[101][101];
        for(int t=0;t<T;t++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int H=Integer.parseInt(st.nextToken()), W=Integer.parseInt(st.nextToken()), ans=0;
            for(int i=0;i<H;i++)
                sheep[i]=br.readLine().toCharArray();
            for(int i=0;i<H;i++){
                for(int j=0;j<W;j++)
                    if(sheep[i][j]=='#'){
                        ans++;
                        q.add(new int [] {i, j});
                        sheep[i][j]='.';
                        while(q.size()>0){
                            int x=q.peek()[0], y=q.poll()[1];

                            for(int k=0;k<4;k++){
                                int nx=x+dx[k], ny=y+dy[k];
                                if(nx>=0 && nx<H && ny>=0 && ny<W) {
                                    if(sheep[nx][ny]=='#')
                                        q.add(new int[] {nx,ny});
                                    sheep[nx][ny]='.';
                                }
                            }
                        }
                    }
            }
            bw.write(ans+"\n");
        }
        bw.close();
    }
}
