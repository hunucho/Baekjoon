import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken()), K=Integer.parseInt(st.nextToken());
        int [] X = new int [N];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++)
            X[i]=Integer.parseInt(st.nextToken());

        int ans=0, cur=X[0];
        for(int i=1;i<N;i++){
            if(cur+K < X[i]){
                cur = X[i];
                ans++;
            }
        }
        System.out.println(ans+1);
    }
}