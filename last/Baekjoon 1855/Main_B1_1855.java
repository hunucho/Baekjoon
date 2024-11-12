import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        String S = br.readLine();
        int len=S.length();
        char [][] ch = new char[len/K][K];
        for(int i=0;i<len/K;i++){
            if(i%2==0)
                ch[i] = S.substring(i*K, (i+1)*K).toCharArray();
            else {
                StringBuilder sb = new StringBuilder();
                sb.append(S.substring(i * K, (i + 1) * K)).reverse();
                ch[i] = sb.toString().toCharArray();
            }
        }
        for(int i=0;i<K;i++)
            for(int j=0;j<len/K;j++)
                System.out.print(ch[j][i]);
    }
}