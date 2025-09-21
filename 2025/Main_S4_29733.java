import java.io.*;
import java.util.*;

public class Main {
    static int R, C, H;
    static boolean [][][] arr;

    public static void main(String[] args) throws  Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R=Integer.parseInt(st.nextToken()); // 가로
        C=Integer.parseInt(st.nextToken()); // 세로
        H=Integer.parseInt(st.nextToken()); // 층
        arr = new boolean [H+2][R+2][C+2];
        for(int k=1;k<=H;k++)
            for(int i=1;i<=R;i++){
                String S=br.readLine();
                for(int j=1;j<=C;j++)
                    arr[k][i][j]=S.charAt(j-1)=='*'?true:false;
            }
        StringBuilder sb = new StringBuilder();
        for(int k=1;k<=H;k++){
            for(int i=1;i<=R;i++){
                for(int j=1;j<=C;j++){
                    sb.append(arr[k][i][j]?"*":getMine(i,j,k)%10);
                }
                sb.append("\n");
            }
        }
        System.out.print(sb);
    }

    public static int getMine(int r, int c, int h){
        int [] dr = {-1, 0, 1}, dc = {-1, 0, 1}, dh = {-1, 0, 1};
        int ret=0;

        for(int k=0;k<3;k++)
            for(int i=0;i<3;i++)
                for(int j=0;j<3;j++){
                    if(i==1 && j==1 && k==1)
                        continue;
                    if(arr[h+dh[k]][r+dr[i]][c+dc[j]])
                        ret++;
                }
      return ret;
    }
}
