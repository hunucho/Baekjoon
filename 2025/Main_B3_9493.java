import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws  Exception {
        Scanner sc=new Scanner(System.in);
        while(true){
            float M=sc.nextInt(), A=sc.nextInt(), B=sc.nextInt();
            if(M==0 && A==0 && B==0)
                break;
            float t = Math.round((M/A - M/B)*3600);
            System.out.printf("%d:",(int)(t/3600));
            System.out.printf("%02d:",(int)((t%3600)/60));
            System.out.printf("%02d\n",(int)(t%60));
        }
    }
}
