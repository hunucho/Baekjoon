import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken()), K=Integer.parseInt(st.nextToken()), ans=0;
        int [] box = new int [N];
        if(N-K<(K-1)*K/2) {
            ans=-1;
        } else{
            for(int i=0;i<K;i++) {
                box[i] = i + 1;
                N-=i+1;
            }
            int j=K-1;
            for(int i=0;i<N;i++){
                box[j--]++;
                if(j==-1)
                    j=K-1;
            }
            ans=box[K-1]-box[0];
        }

        System.out.print(ans);
    }
}