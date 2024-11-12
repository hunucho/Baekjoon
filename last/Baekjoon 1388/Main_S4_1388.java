import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken()), M=Integer.parseInt(st.nextToken()), ans=0;
        char [][] map = new char[N][M];
        for(int i=0;i<N;i++)
            map[i]=br.readLine().toCharArray();
        char prev=' ';
        for(int i=0;i<N;i++){
            prev='|';
            for(int j=0;j<M;j++)
                if(map[i][j]=='-'){
                    if(prev!='-') {
                        ans++;
                        prev='-';
                    }
                } else {
                    prev ='|';
                }
        }
        for(int j=0;j<M;j++){
            prev='-';
            for(int i=0;i<N;i++)
                if(map[i][j]=='|'){
                    if(prev!='|') {
                        ans++;
                        prev='|';
                    }
                } else {
                    prev='-';
                }


        }
        System.out.println(ans);
    }
}