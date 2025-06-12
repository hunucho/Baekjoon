import java.io.*;
import java.util.*;
public class Main {
    static int [] arr;
    static int N, ans;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());
        for(int t=0;t<T;t++){
            N=Integer.parseInt(br.readLine());
            ans=0;
            arr = new int [N+1];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i=1;i<=N;i++)
                arr[i]=Integer.parseInt(st.nextToken());
            for(int i=1;i<=N;i++)
                check(i, true);
            System.out.println(ans);
        }
    }
    public static void check(int s, boolean init){
        if(arr[s]==0)
            return;
        if(init)
            ans++;
        int next = arr[s];
        arr[s]=0;
        check(next, false);
    }
}
