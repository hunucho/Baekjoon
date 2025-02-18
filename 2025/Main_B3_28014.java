import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int ans=0, last=-1;
        for(int i=0;i<N;i++){
            int tmp=Integer.parseInt(st.nextToken());
            if(tmp>=last)
                ans++;
            last = tmp;
        }
        System.out.println(ans);
    }
}