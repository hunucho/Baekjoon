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
            else if(ch=='K'){
                if(s>0) {
                    ans++;
                    s--;
                } else
                    break;
            } else if(ch=='R'){
                if(l>0) {
                    ans++;
                    l--;
                } else
                    break;
            } else
                ans++;
        }
        System.out.print(ans);
    }
}