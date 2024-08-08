import java.io.*;
import java.math.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        BigInteger A=new BigInteger(sc.next()), B=new BigInteger(sc.next()), C=new BigInteger(sc.next());
        BigInteger ans = A.multiply(B.multiply(C));
        int [] cnt = new int [10];
        String S=ans.toString();
        for(char ch:S.toCharArray())
            cnt[ch-'0']++;
        for(int i=0;i<10;i++)
            System.out.println(cnt[i]);
    }
}