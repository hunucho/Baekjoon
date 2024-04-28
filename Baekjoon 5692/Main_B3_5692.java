import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] fact = new int [6];
        fact[0]=1;
        for(int i=1;i<=5;i++)
            fact[i]=fact[i-1]*i;
        while(true){
            int N=sc.nextInt(), ans=0;
            if(N==0)
                break;
            int i=1;
            while(N>0){
                ans+=N%10*fact[i++];
                N/=10;
            }
            System.out.println(ans);
        }
    }
}