import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int P=Integer.parseInt(br.readLine());
        for(int p=0;p<P;p++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int T=Integer.parseInt(st.nextToken());
            int [] arr = new int [20];
            for(int i=0;i<20;i++)
                arr[i]=Integer.parseInt(st.nextToken());
            int ans=0;
            for(int i=19;i>0;i--){
                for(int j=i-1;j>=0;j--)
                    if(arr[i]<arr[j]){
                        int tmp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=tmp;
                        ans++;
                    }
            }
            System.out.println(T+" "+ans);
        }
    }
}