import java.math.BigInteger;
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String N=br.readLine();
        long ans=0;
        for(int i=0;i<N.length();i++)
            ans = (ans*10 + (N.charAt(i)-'0'))%20000303;
        bw.write(ans+"");
        bw.close();
    }
}