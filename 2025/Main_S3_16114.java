import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int X=sc.nextInt(), N=sc.nextInt();
        if(N==1)
            System.out.print(X>=0?0:"INFINITE");
        else if(N%2==1)
            System.out.print("ERROR");
        else if(X<=0)
            System.out.print(0);
        else if(N==0)
            System.out.print("INFINITE");
        else {
            int ans=0;
            X-=N/2;
            while(X>0){
                X-=N/2;
                ans++;
            }
            System.out.print(ans);
        }
    }
}