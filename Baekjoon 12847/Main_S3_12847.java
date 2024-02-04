import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());
        long ans=0, tmp=0;
        st = new StringTokenizer(br.readLine());
        int [] arr = new int [N];
        for(int i=0;i<M;i++) {
            arr[i]=Integer.parseInt(st.nextToken());
            tmp += arr[i];
        }
        ans=tmp;
        for(int i=0;i<N-M;i++){
            tmp-=arr[i];
            arr[i+M]=Integer.parseInt(st.nextToken());
            tmp+=arr[i+M];
            ans = Math.max(ans, tmp);
        }
        System.out.println(ans);
    }
}