import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        String S = br.readLine();
        System.out.println(S.contains("gori")?"YES":"NO");
    }
}