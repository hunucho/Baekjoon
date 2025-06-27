import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            int M=Integer.parseInt(st.nextToken());
            System.out.print((M==300?1:M>=275?2:M>=250?3:4)+" ");
        }
    }
}