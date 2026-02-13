import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int t=0;t<T;t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            while(st.hasMoreTokens()){
                String S = st.nextToken();
                int tmp=0;
                for(char ch:S.toCharArray())
                    tmp=(tmp + ch-'a')%27;
                tmp+='a';
                System.out.print(tmp=='{'?" ":(char)tmp);
            }
            System.out.println();
        }
    }
}