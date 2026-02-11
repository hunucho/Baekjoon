import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()), len = String.valueOf(N).length();
        int ans=0;
        while(String.valueOf(N*2).length()==len) {
            N *= 2;
            ans++;
        }
        System.out.println(ans);
    }
}