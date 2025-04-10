import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt(), b=sc.nextInt();
        for(int i=1;i<=Math.min(a,b);i++){
            if(a%i==0 && b%i==0)
                System.out.println(i+" "+a/i+" "+b/i);
        }
    }
}