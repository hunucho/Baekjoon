import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);
        BigInteger b1 = new BigInteger("1"), b2 = new BigInteger("1");
        int N=sc.nextInt();
        for(int i=1;i<N;i++) {
            BigInteger tmp = b1.add(b2);
            b1=b2;
            b2=tmp;
        }
        System.out.print(b1);
    }
}