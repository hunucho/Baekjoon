import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        HashSet<String> hs = new HashSet<>();
        for(int i=0;i<N;i++) {
            char [] S = br.readLine().toCharArray();
            Arrays.sort(S);
            hs.add(String.valueOf(S));
        }
        System.out.print(hs.size());
    }
}