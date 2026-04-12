import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String W = br.readLine();
        String S = br.readLine();
        char [] pw = new char[26];
        boolean [] chk = new boolean[26];
        int j=0;
        for(int i=0;i<W.length();i++){
            char ch = W.charAt(i);
            if(!chk[ch-'A']) {
                chk[ch-'A']=true;
                pw[j++] = ch;
            }
        }
        for(int i=0;i<26;i++){
            if(!chk[i]) {
                pw[j++] = (char) (i + 'A');
                chk[i]=true;
            }
        }
        for(char ch:S.toCharArray()){
            System.out.print(pw[ch-'A']);
        }
    }
}