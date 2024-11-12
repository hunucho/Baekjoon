import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        long ans=0;
        int [] arr = new int [N];
        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i]=Integer.parseInt(st.nextToken());
            ans+=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        for(int i=1;i<=N;i++)
            ans+=(long)arr[i-1]*i;
        System.out.println(ans);
    }
}
