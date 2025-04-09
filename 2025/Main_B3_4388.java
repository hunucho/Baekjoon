import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        while(true){
            long A=sc.nextLong(), B=sc.nextLong();
            int add=0, cnt=0;
            if(A==0 && B==0)
                break;
            while(A>0 || B>0){
                int a= (int) (A%10 + B%10)+add;
                if(a>9) {
                    cnt++;
                    add=1;
                } else
                    add=0;
                A/=10;
                B/=10;
            }
            System.out.println(cnt);
        }
    }
}