import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char [][] arr = new char[7][7];
        int ans=0;
        int [] dx = {-1, 1, 0, 0}, dy = {0, 0, -1, 1};
        for(int i=0;i<7;i++)
            arr[i] = br.readLine().toCharArray();
        for(int i=0;i<7;i++){
            for(int j=0;j<7;j++){
                if(arr[i][j]=='o'){
                    for(int k=0;k<4;k++){
                        int nx=i+dx[k], ny=j+dy[k], cx=i+2*dx[k], cy=j+2*dy[k];
                        if(0<=nx && nx<7 && 0<=ny && ny<7 && 0<=cx && cx<7 && 0<=cy && cy<7){
                            if(arr[nx][ny]=='o' && arr[cx][cy]=='.')
                                ans++;
                        }
                    }
                }
            }
        }
        System.out.print(ans);
    }
}