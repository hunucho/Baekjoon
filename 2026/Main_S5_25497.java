import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String S = br.readLine();
        int l=0, s=0, ans=0;
        for(char ch:S.toCharArray()){
            if(ch=='S')
                s++;
            else if(ch=='L')
                l++;
            else if(Character.isDigit(ch))
                ans++;
            else if(ch=='K' && s>0){
                s--;
                ans++;
            } else if(ch=='R' && l>0){
                l--;
                ans++;
            }
        }
        System.out.print(ans);
    }
}