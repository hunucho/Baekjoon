import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String S = br.readLine();
        Map<Character, String> map = new HashMap<>();
        map.put('a', "aespa");
        map.put('b', "baekjoon");
        map.put('c', "cau");
        map.put('d', "debug");
        map.put('e', "edge");
        map.put('f', "firefox");
        map.put('g', "golang");
        map.put('h', "haegang");
        map.put('i', "iu");
        map.put('j', "java");
        map.put('k', "kotlin");
        map.put('l', "lol");
        map.put('m', "mips");
        map.put('n', "null");
        map.put('o', "os");
        map.put('p', "python");
        map.put('q', "query");
        map.put('r', "roka");
        map.put('s', "solvedac");
        map.put('t', "tod");
        map.put('u', "unix");
        map.put('v', "virus");
        map.put('w', "whale");
        map.put('x', "xcode");
        map.put('y', "yahoo");
        map.put('z', "zebra");

        for(int i=0;i<S.length();){
            char ch = S.charAt(i);
            String s = map.get(ch);
            if(i+s.length()<=S.length() && s.equals(S.substring(i, i+s.length()))){
                sb.append(ch);
                i+=s.length();
            } else {
                System.out.print("ERROR!");
                return;
            }
        }
        System.out.println("It's HG!");
        System.out.print(sb);
    }
}