import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken()), m=Integer.parseInt(st.nextToken()), ans=Integer.MAX_VALUE, per=0;
        int [][] frn = new int[n+1][n+1];
        for(int i=1;i<=n;i++) {
            Arrays.fill(frn[i], 999);
            frn[i][i] = 0;
        }
        for(int i=1;i<=m;i++){
            st = new StringTokenizer(br.readLine());
            int x=Integer.parseInt(st.nextToken()), y=Integer.parseInt(st.nextToken());
            frn[x][y]=frn[y][x]=1;
        }
        for(int k=1;k<=n;k++)
            for(int i=1;i<=n;i++)
                for(int j=1;j<=n;j++)
                    frn[i][j]=frn[j][i]=Math.min(frn[i][j],frn[i][k]+frn[k][j]);
        for(int i=1;i<=n;i++) {
            int tmp=0;
            for (int j = 1; j <= n; j++)
                tmp+=frn[i][j];
            if(ans>tmp) {
                ans = tmp;
                per = i;
            }
        }
        System.out.println(per);
    }
}
