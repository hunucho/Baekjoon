import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine()), ans=0;
        String S = br.readLine();
        for(int i=0;i<N;i++) {
            ans+=S.charAt(i)-'A'+1;
        }
        System.out.print(ans);
    }
}