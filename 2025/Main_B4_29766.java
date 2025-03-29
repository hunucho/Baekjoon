import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        int len=S.length(), edited=S.replaceAll("DKSH", "").length();
        System.out.println((len-edited)/4);
    }
}