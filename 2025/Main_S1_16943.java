import java.io.*;
import java.util.*;
public class Main {
    static int [] arr;
    static int ans = -1, len;
    static int A, B;
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        A=sc.nextInt();
        B=sc.nextInt();
        len = String.valueOf(A).length();
        arr = new int [10];
        while(A>0) {
            arr[A%10]++;
            A/=10;
        }
        if (len <= String.valueOf(B).length()) {
            f(0, 0);
        }
        System.out.print(ans);
    }
    public static void f(int depth, int tmp){
        if(len==depth){
            if(tmp<B)
                ans = Math.max(ans, tmp);
            return;
        }
        for(int i=(depth==0?1:0);i<10;i++){
            for(int j=0;j<arr[i];j++){
                tmp = tmp*10+i;
                arr[i]--;
                f(depth+1, tmp);
                tmp/=10;
                arr[i]++;
            }
        }
    }
}