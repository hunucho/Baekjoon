import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int W0 = sc.nextInt(), I0=sc.nextInt(), T=sc.nextInt(), A0=0;
        int D=sc.nextInt(), I=sc.nextInt(), A=sc.nextInt();
        int w0=W0;
        for(int i=0;i<D;i++)
            w0=w0-I0+I-A;
        System.out.println(w0<=0?"Danger Diet":w0+" "+I0);
        boolean isDanger = false;
        int i0=I0;
        for(int i=0;i<D;i++){
            int consumption = I0+A;
            W0=W0+(I-consumption);
            if(Math.abs(I-consumption)>T)
                I0+=Math.floorDiv((I-consumption),2);
            if(W0<=0 || I0<=0)
                isDanger = true;
        }
        String ans = i0>I0?"YOYO":"NO";
        System.out.print(isDanger?"Danger Diet":W0+" "+I0+" "+ans);
    }
}