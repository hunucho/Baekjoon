import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()), ans=0;
        String S = br.readLine();
        for(int i=0;i<N/2;i++){
            if(S.charAt(i)!=S.charAt(N-i-1))
                ans++;
        }
        System.out.print(ans);
    }
}