import java.io.*;
import java.util.*;
public class Main {
    static int [] arr;
    public int fibonacci(int n) {
        if(n<2)
            return arr[n];
        return arr[n-2]+arr[n-1];
    }

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        arr = new int [60];
        arr[0]=arr[1]=1;
        for(int i=2;i<=N;i++){
            arr[i]=(arr[i-2]+arr[i-1]+1)%1000000007;
        }
        System.out.println(arr[N]);
    }
}