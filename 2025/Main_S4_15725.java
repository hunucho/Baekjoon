import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String S=sc.next();
        System.out.print(f(S));
    }
    public static int f(String S){
        if(S.charAt(0)=='x')
            return 1;
        else if(S.charAt(0)=='-' && S.charAt(1)=='x')
            return -1;
        else if(S.indexOf('x')==-1)
            return 0;
        return Integer.parseInt(S.substring(0, S.indexOf('x')));
    }
}