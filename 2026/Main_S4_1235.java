import java.io.*;
import java.util.*;

public class Main {
    static int N, len;
    static String [] S;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        S = new String[N];
        for(int i=0;i<N;i++)
            S[i]=br.readLine();
        len = S[0].length();
        int ans=len;
        for(int i=1;i<=len;i++){
            boolean ret = F(i);
            if(ret) {
                ans = i;
                break;
            }
        }
        System.out.print(ans);
    }

    static boolean F(int abb){
        HashSet<String> hs = new HashSet<>();
        for(int i=0;i<N;i++){
            String key =S[i].substring(len-abb);
            if(hs.contains(key))
                return false;
            hs.add(key);
        }
        return true;
    }
}