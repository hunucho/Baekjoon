import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        for(int t=0;t<T;t++){
            String X=sc.next();
            boolean [] chk = new boolean[10];
            for(char ch:X.toCharArray())
                chk[ch-'0']=true;
            int ans=0;
            for(int i=0;i<10;i++)
                if(chk[i])
                    ans++;
            System.out.println(ans);
        }
    }
}