import java.util.*;
import java.io.*;

class Main {
    static boolean chk;
    static String S, T;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        S = sc.nextLine();
        T = sc.nextLine();
        isPossible(T);
        System.out.println(chk?1:0);
    }
    public static void isPossible(String t){
        if(S.length()==t.length() || chk) {
            if (S.compareTo(t) == 0) {
                chk = true;
            }
            return;
        }

        if(t.charAt(t.length()-1)=='A')
            isPossible(t.substring(0, t.length()-1));
        if(t.charAt(0)=='B') {
            String tmp = t.substring(1);
            String tt = "";
            for (char ch : tmp.toCharArray())
                tt = ch + tt;
            isPossible(tt);
        }
    }
}