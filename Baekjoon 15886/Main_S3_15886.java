import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine()), ans=0;
        String S = br.readLine();
        boolean [] visited = new boolean[N+2];
        for(int i=1;i<=N;i++){
            if(S.charAt(i-1)=='E'){
                if(visited[i+1] || visited[i])
                    visited[i]=visited[i+1]=true;
                else {
                    visited[i]=visited[i+1]=true;
                    ans++;
                }
            } else if(S.charAt(i-1)=='W'){
                if(visited[i-1] || visited[i])
                    visited[i]=visited[i-1]=true;
                else {
                    visited[i]=visited[i-1]=true;
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}