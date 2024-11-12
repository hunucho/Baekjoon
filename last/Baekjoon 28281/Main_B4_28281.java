import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt(), X=sc.nextInt(), ans=Integer.MAX_VALUE;
        int [] arr = new int [N];
        arr[0]=sc.nextInt();
        for(int i=1;i<N;i++){
            arr[i]=sc.nextInt();
            ans=Math.min(ans, arr[i-1]+arr[i]);
        }
        System.out.println(ans*X);
    }
}