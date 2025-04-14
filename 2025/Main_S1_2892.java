import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception{
        String S="0123456789 .";
        HashSet<Integer> hs = new HashSet<>();
        for(char i='a';i<='z';i++){
            for(char j:S.toCharArray())
                hs.add(i^j);
        }
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<N;i++)
            sb.append(hs.contains(Integer.parseInt(st.nextToken(), 16))?'-':'.');
        System.out.println(sb);
    }
}