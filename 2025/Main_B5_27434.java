import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        if(N==0)
            bw.write("1");
        else
            bw.write(Factorial(1, N).toString());
        bw.close();
    }
    static BigInteger Factorial(int start, int end){
        if(start==end)
            return BigInteger.valueOf(end);
        return Factorial(start, (start+end)/2).multiply(Factorial((start+end)/2+1, end));
    }
}