import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String a="", b="";
        while((a=br.readLine())!=null){
            int [] arr = new int [26], brr = new int [26];
            b=br.readLine();
            for(char ch:a.toCharArray())
                arr[ch-'a']++;
            for(char ch:b.toCharArray())
                brr[ch-'a']++;
            for(int i=0;i<26;i++)
                sb.append(Character.toString('a'+i).repeat(Math.min(arr[i], brr[i])));
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}