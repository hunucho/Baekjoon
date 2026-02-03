import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for(int t=0;t<T;t++){
            String message = br.readLine();
            char [] rule = new char [26];
            String S = br.readLine();
            for(int i=0;i<26;i++)
                rule[i]=S.charAt(i);
            for(int i=0;i<message.length();i++){
                char ch = message.charAt(i);
                if(Character.isAlphabetic(ch))
                    sb.append(rule[ch-'A']);
                else
                    sb.append(ch);
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}