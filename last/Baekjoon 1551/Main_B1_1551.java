import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int N=Integer.parseInt(st.nextToken()), K=Integer.parseInt(st.nextToken());
        int [] A = new int [N], B=new int [N];
        st = new StringTokenizer(br.readLine(),",");
        for(int i=0;i<N;i++)
            A[i]=Integer.parseInt(st.nextToken());
        for(int i=0;i<K;i++){
            for(int j=0;j<N-i-1;j++)
                A[j]=A[j+1]-A[j];
        }
        for(int j=0;j<N-K;j++)
            sb.append(A[j]+",");
        sb.setLength(sb.length()-1);
        System.out.println(sb.toString());
    }
}
