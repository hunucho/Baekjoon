import java.math.BigDecimal;
import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        BigDecimal A = new BigDecimal(sc.next()), B = new BigDecimal(sc.next());
        System.out.println(A.divide(B, 1000, BigDecimal.ROUND_HALF_UP));
    }
}