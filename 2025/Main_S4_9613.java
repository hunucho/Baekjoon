import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int t=0;t<T;t++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n=Integer.parseInt(st.nextToken());
            long ans=0;
            int [] A = new int [n];
            for(int i=0;i<n;i++)
                A[i]=Integer.parseInt(st.nextToken());
            for(int i=0;i<n;i++) {
                for (int j=i+1;j<n;j++)
                    ans+=GCD(A[i], A[j]);
            }
            System.out.println(ans);
        }
    }
    public static int GCD(int a, int b){
        if(b>a){
            int c=a;
            a=b;
            b=c;
        }
        while(b!=0){
            int n=a%b;
            a=b;
            b=n;
        }
        return a;
    }
}