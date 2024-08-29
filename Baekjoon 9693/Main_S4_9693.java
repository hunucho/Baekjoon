import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int cnt=1;
        while(true){
            int N=sc.nextInt(), ans=0;
            if(N==0)
                break;
            else {
                for(int i=5;i<=N;i+=5) {
                    int j=i;
                    while(j%5==0){
                        ans++;
                        j/=5;
                    }
                }
                System.out.printf("Case #"+cnt+": "+ans+"\n");
                cnt++;
            }
        }
    }
}