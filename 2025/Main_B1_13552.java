import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N=Integer.parseInt(br.readLine());
        int [][] pos = new int [N][3];
        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0;j<3;j++)
                pos[i][j]=Integer.parseInt(st.nextToken());
        }
        int M=Integer.parseInt(br.readLine());
        for(int i=0;i<M;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int z = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());
            int ans=0;
            for(int j=0;j<N;j++){
                if(getDist(pos[j], x, y, z)<= 1l*r*r)
                    ans++;
            }
            sb.append(ans).append("\n");
        }
        System.out.print(sb);
    }
    static long getDist(int[] point, int x, int y, int z){
        int a = point[0]-x;
        int b = point[1]-y;
        int c = point[2]-z;
        return 1l*a*a + 1l*b*b + 1l*c*c;
    }
}