import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N=Integer.parseInt(br.readLine());
        for(int i=0;i<N;i++)
            sb.append(isPalindrome(br.readLine().toLowerCase())?"Yes":"No").append("\n");
        System.out.print(sb);
    }
    public static boolean isPalindrome(String S){
        for(int i=0;i<S.length()/2;i++)
            if(S.charAt(i)!=S.charAt(S.length()-i-1))
                return false;
        return true;
    }
}