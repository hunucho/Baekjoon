import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws  Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N=Long.parseLong(br.readLine());
        String ans = "long long";
        if(Short.MIN_VALUE<=N && N<=Short.MAX_VALUE)
            ans = "short";
        else if(Integer.MIN_VALUE<=N && N<=Integer.MAX_VALUE)
            ans = "int";
        System.out.print(ans);
    }
}
