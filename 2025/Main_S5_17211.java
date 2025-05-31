import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt(), feeling=sc.nextInt();
        double gg=sc.nextDouble(), gb=sc.nextDouble(), bg=sc.nextDouble(), bb=sc.nextDouble(), G=0, B=0;
        if(feeling==0)
            G=1;
        else
            B=1;
        for(int i=0;i<N;i++){
            double tmrG=0, tmrB=0;
            tmrG = G*gg + B*bg;
            tmrB = G*gb + B*bb;
            G=tmrG;
            B=tmrB;
        }
        System.out.printf("%d\n%d", Math.round(G*1000),Math.round(B*1000) );
    }
}