import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int K=sc.nextInt();
        String S=sc.next();
        for(int i=0;i<S.length();i+=K)
            System.out.print(S.charAt(i));
    }
}