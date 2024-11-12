import java.math.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger[] fibo = new BigInteger[501];
        fibo[0] = new BigInteger("0");
        fibo[1] = new BigInteger("1");
        fibo[2] = new BigInteger("2");
        for (int i = 3; i < 501; i++)
            fibo[i] = fibo[i - 2].add(fibo[i - 1]);
        while (true) {
            BigInteger a = new BigInteger(sc.next()), b = new BigInteger(sc.next());
            int ans = 0;
            if (a.compareTo(BigInteger.ZERO) == 0 && b.compareTo(BigInteger.ZERO) == 0)
                break;
            for (int i = 1; i < 501; i++) {
                if (fibo[i].compareTo(a) >= 0 && fibo[i].compareTo(b) <= 0)
                    ans++;
                else if(fibo[i].compareTo(b)>0)
                    break;
            }
            System.out.println(ans);
        }
    }
}