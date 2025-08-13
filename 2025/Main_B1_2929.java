import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        int ans=0, pos=0;
        for(int i=1;i<S.length();i++){
            char ch = S.charAt(i);
            pos++;
            if(Character.isUpperCase(ch)){
                if(pos%4!=0)
                    ans+=4-pos%4;
                pos=0;
            }
        }
        System.out.print(ans);
    }
}