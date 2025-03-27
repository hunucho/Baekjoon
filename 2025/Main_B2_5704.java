import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = "";
        while((S=br.readLine()).compareTo("*")!=0){
            boolean [] alpha = new boolean[26];
            int cnt=0;
            for(char ch:S.toCharArray()){
                if(Character.isAlphabetic(ch)&&!alpha[ch-'a']){
                    cnt++;
                    alpha[ch-'a']=true;
                }
            }
            System.out.println(cnt==26?"Y":"N");
        }
    }
}