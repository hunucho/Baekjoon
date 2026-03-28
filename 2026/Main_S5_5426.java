import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int t=0;t<T;t++){
            String S = br.readLine();
            int len = (int)Math.pow(S.length(), 0.5);
            for(int i=len-1;i>=0;i--){
                for(int j=0;j<len;j++)
                    sb.append(S.charAt(j*len+i));
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
