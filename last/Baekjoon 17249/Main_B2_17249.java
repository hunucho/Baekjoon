import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l=0, r=0;
        boolean sw=false;
        String str=br.readLine();
        for(char ch:str.toCharArray()){
            if(ch==')')
                sw=true;
            if(ch=='@') {
                if (sw)
                    r++;
                else
                    l++;
            }
        }
        System.out.println(l+" "+r);
    }
}
