import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken()), M=Integer.parseInt(st.nextToken()), cnt=1;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                sb.append(cnt++ +" ");
            }
            sb.setLength(sb.length()-1);
            sb.append("\n");
        }
        System.out.println(sb);
    }
}