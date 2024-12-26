import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());
        for(int t=1;t<=T;t++){
            int B=Integer.parseInt(br.readLine());
            String str = br.readLine(), ans="";
            for(int i=0;i<str.length()/8;i++){
                String tmp = str.substring(i*8, (i+1)*8);
                String parse ="";
                for(char ch:tmp.toCharArray())
                    parse+=ch=='I'?"1":"0";
                ans+=(char)Integer.parseInt(parse, 2);
            }
            System.out.printf("Case #%d: %s\n", t, ans);
        }
    }
}

