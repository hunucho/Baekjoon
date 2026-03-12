import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        char ch = S.charAt(0);
        String ans = "Exploration";
        if(ch=='F')
            ans = "Foundation";
        else if(ch=='C')
            ans = "Claves";
        else if(ch =='V')
            ans = "Veritas";
        System.out.print(ans);
    }
}
