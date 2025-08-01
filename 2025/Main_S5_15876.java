import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(), k=sc.nextInt()-1;
        String S="";
        for(int i=0;i<100;i++)
            S+=Integer.toBinaryString(i);
        for(int i=0;i<5;i++)
            System.out.print(S.charAt(k+i*n)+" ");
    }
}