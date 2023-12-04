import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T=Integer.parseInt(br.readLine());
        for(int t=0;t<T;t++){
            int N=Integer.parseInt(br.readLine());
            HashSet<String > n = new HashSet<>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i=0;i<N;i++)
                n.add(st.nextToken());
            int M=Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            for(int i=0;i<M;i++)
                bw.write(n.contains(st.nextToken())?"1\n":"0\n");
        }
        bw.close();
    }
}
