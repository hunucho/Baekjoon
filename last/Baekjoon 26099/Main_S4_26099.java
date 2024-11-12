import java.io.*;
import java.math.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        BigInteger N = new BigInteger(sc.next()), F = new BigInteger("5"), T = new BigInteger("3");
        BigInteger ans = new BigInteger("0");
        while(N.mod(F)!=BigInteger.ZERO){
            N=N.subtract(T);
            ans=ans.add(BigInteger.ONE);
        }
        System.out.println(N.compareTo(BigInteger.ZERO)<0?-1:ans.add(N.divide(F)));
    }
}