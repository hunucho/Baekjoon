import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        char last = S.charAt(0);
        long ans = last=='d'?10:26;
        for(int i=1;i<S.length();i++){
            if(S.charAt(i)==last){
                if(last=='d')
                    ans*=9;
                else
                    ans*=25;
            } else {
                if(S.charAt(i)=='d')
                    ans*=10;
                else
                    ans*=26;
            }
            last = S.charAt(i);
            ans%=1000000009;
        }
        System.out.print(ans);
    }
}