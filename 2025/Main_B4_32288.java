import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        String S=br.readLine();
        StringBuilder sb = new StringBuilder();
        for(char ch:S.toCharArray()) {
            if (ch == 'l')
                sb.append('L');
            else
                sb.append('i');
        }
        System.out.println(sb);
    }
}