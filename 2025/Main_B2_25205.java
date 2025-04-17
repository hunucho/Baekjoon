import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        char [] ch = br.readLine().toCharArray();
        String S = "qwertasdfgzxcv";
        System.out.print(S.contains(String.valueOf(ch[N-1]))?1:0);
    }
}