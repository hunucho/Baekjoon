import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A=sc.nextInt(), B=sc.nextInt(), C=sc.nextInt(),D=sc.nextInt();
        for(int i=0;i<3;i++){
            int ans=0, time=sc.nextInt();
            int timeA=time%(A+B), timeB=time%(C+D);
            if(1<=timeA && timeA<=A)
                ans++;
            if(1<=timeB && timeB<=C)
                ans++;
            System.out.println(ans);
        }
    }
}