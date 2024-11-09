import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char cur = br.readLine().charAt(0);
        String pw = "ILOVEYONSEI";
        int ans=0;
        for(char ch:pw.toCharArray()){
            ans+=Math.abs(ch-cur);
            cur=ch;
        }
        System.out.println(ans);
    }
}