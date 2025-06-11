import java.io.*;
import java.util.*;
public class Main {
    static String S;
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        S = sc.next();
        for(int i=15;i>0;i--)
            Change(i);
        System.out.print(S.length()==0?1:0);
    }
    public static void Change(int N){
        String wolf = "wolf", rp="";
        for(char ch : wolf.toCharArray())
            for(int i=0;i<N;i++)
                rp+=ch;
        S=S.replaceAll(rp,"");
    }
}
