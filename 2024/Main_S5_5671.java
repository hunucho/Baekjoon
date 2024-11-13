import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while((str=br.readLine())!=null){
            StringTokenizer st = new StringTokenizer(str);
            if(!st.hasMoreTokens())
                break;
            int N=Integer.parseInt(st.nextToken()), M=Integer.parseInt(st.nextToken()), ans=0;
            for(int i=N;i<=M;i++)
                ans+=isRepeated(i)?0:1;
            System.out.println(ans);
        }

    }
    static boolean isRepeated(int N){
        int [] cnt = new int [10];
        while(N>0){
            cnt[N%10]++;
            N/=10;
        }
        for(int i=0;i<10;i++)
            if(cnt[i]>1)
                return true;
        return false;
    }
}