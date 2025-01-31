import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=1;i<=N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int cnt=0;
            for(int j=0;j<10;j++){
                if(Integer.parseInt(st.nextToken())-1==j%5)
                    cnt++;
            }
            if(cnt==10)
                sb.append(i).append("\n");
        }
        System.out.print(sb);
    }
}