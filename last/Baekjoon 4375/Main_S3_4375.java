import java.math.BigInteger;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            BigInteger bi = new BigInteger("1");
            BigInteger n = new BigInteger(sc.nextLine());
            while(bi.mod(n).intValue()!=0)
                bi=bi.multiply(new BigInteger("10")).add(new BigInteger("1"));
            System.out.println(String.valueOf(bi).length());
        }
    }
}
