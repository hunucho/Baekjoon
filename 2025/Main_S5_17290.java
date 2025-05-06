import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int r=Integer.parseInt(st.nextToken()), c=Integer.parseInt(st.nextToken());
        boolean [][] inArr = new boolean[10][10], arr = new boolean[10][10];
        for(int i=0;i<10;i++){
            String tmp=br.readLine();
            for(int j=0;j<10;j++){
                if(tmp.charAt(j)=='o')
                    inArr[i][j]=true;
            }
        }
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                if(inArr[i][j]){
                    for(int k=0;k<10;k++)
                        arr[i][k] = arr[k][j]= true;
                }
            }
        }
        int ans=9999;
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                if(!arr[i][j])
                    ans = Math.min(ans, getDist(r-1, c-1, i, j));
            }
        }
        System.out.print(ans);
    }

    public static int getDist(int r, int c, int x, int y){
        return Math.abs(x-r)+Math.abs(y-c);
    }
}