import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        int [][] arr = new int [N+1][2];
        int [] brr = new int [N+1];
        Arrays.fill(brr,1);
        brr[0]=0;
        for(int i=1;i<=N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0]=Integer.parseInt(st.nextToken());
            arr[i][1]=Integer.parseInt(st.nextToken());
            if(arr[i][0]==0 || arr[i][1]==0)
                brr[i]=-1;
        }
        int M=Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<M;i++)
            brr[Integer.parseInt(st.nextToken())]=0;
        int ans=0;
        for(int i=1;i<=N;i++){
            if(brr[arr[i][0]] !=0 && brr[arr[i][1]]!=0 && brr[i]!=0)
                ans++;
        }
        System.out.println(ans);
    }
}