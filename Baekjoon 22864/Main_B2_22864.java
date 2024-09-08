import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int A=sc.nextInt(), B=sc.nextInt(), C=sc.nextInt(), M=sc.nextInt(), P=0;
        int ans=0;
        for(int i=0;i<24;i++){
            if(P>M) {
                ans=0;
                break;
            }
            if(P+A<=M && P+A>=0) {
                P+=A;
                ans+=B;
            } else {
                P-=C;
                P=Math.max(0, P);
            }
        }
        System.out.println(ans);
    }
}