import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        String S=br.readLine();
        boolean [][] chk = new boolean[3001][3001];
        int x=1005, y=1005, ans=1;
        chk[x][y]=true;
        for(char ch:S.toCharArray()){
            if(ch=='N')
                x--;
            else if(ch=='S')
                x++;
            else if(ch=='W')
                y--;
            else if(ch=='E')
                y++;
            if(!chk[x][y]) {
                chk[x][y] = true;
                ans++;
            }
        }
        System.out.print(ans);
    }
}