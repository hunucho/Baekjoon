import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N=Integer.parseInt(br.readLine());
        long sum=0, xor=0;
        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int M=Integer.parseInt(st.nextToken()), x=0;
            switch (M) {
                case 1:
                    x=Integer.parseInt(st.nextToken());
                    sum+=x;
                    xor^=x;
                    break;
                case 2:
                    x=Integer.parseInt(st.nextToken());
                    sum-=x;
                    xor^=x;
                    break;
                case 3:
                    bw.write(sum+"\n");
                    break;
                case 4:
                    bw.write(xor+"\n");
                    break;
            }
        }
        bw.close();
    }
}