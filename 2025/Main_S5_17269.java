import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int [] value = {3,2,1,2,4,3,1,3,1,1,3,1,3,2,1,2,2,2,1,2,1,1,1,2,2,1};
        int N=sc.nextInt(), M=sc.nextInt(),  len=N+M;
        String A = sc.next(), B=sc.next();
        int [] arr = new int [len];
        int a=0, b=0;
        for(int i=0;i<len;i++){
            if(i%2==0){
               if(a<N)
                   arr[i]=A.charAt(a++);
               else
                   arr[i]=B.charAt(b++);
            } else{
                if(b<M)
                    arr[i]=B.charAt(b++);
                else
                    arr[i]=A.charAt(a++);
            }
            arr[i]=value[arr[i]-'A'];
        }
        for(;len>2;len--){
            int [] brr = new int [len-1];
            for(int i=0;i<len-1;i++)
                brr[i]=(arr[i]+arr[i+1])%10;
            arr = brr;
        }
        System.out.print((arr[0]*10+arr[1])+"%");
    }
}