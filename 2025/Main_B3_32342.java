import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws  Exception{
        Scanner sc = new Scanner(System.in);
        int Q=sc.nextInt();
        for(int q=0;q<Q;q++){
            int ans=0;
            String S=sc.next();
            for(int i=2;i<S.length();i++){
                if(S.charAt(i-2)=='W' && S.charAt(i-1)=='O' && S.charAt(i)=='W')
                    ans++;
            }
            System.out.println(ans);
        }
    }
}