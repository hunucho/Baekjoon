import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int [][] desks = new int [N][N];
        int px=0, py=0, sx=0, sy=0;
        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0;j<N;j++) {
                desks[i][j] = Integer.parseInt(st.nextToken());
                if(desks[i][j]==2){
                    sx=i;
                    sy=j;
                } else if(desks[i][j]==5){
                    px=i;
                    py=j;
                }
            }
        }
        int ans=1;
        if(Math.sqrt(Math.pow(px - sx, 2)+Math.pow(py-sy, 2))<5)
            ans=0;
        int cnt=0;
        for(int i= Math.min(px, sx);i<=Math.max(px, sx);i++)
            for(int j= Math.min(py, sy);j<=Math.max(py, sy);j++)
                if(desks[i][j]==1)
                    cnt++;
        if(cnt<3)
            ans=0;
        System.out.println(ans);

    }
}