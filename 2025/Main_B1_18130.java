import java.math.BigInteger;
import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken()), Q=Integer.parseInt(st.nextToken()), ansN=0;
        BigInteger ans = new BigInteger("9999999999999999999999999999999999999999");
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            long P=Integer.parseInt(st.nextToken()), K = Integer.parseInt(st.nextToken()), C = Integer.parseInt(st.nextToken());
            long q = (Q-1)/K;
            BigInteger tmp = new BigInteger(String.valueOf(P));
            tmp = tmp.add(new BigInteger(String.valueOf(q)).multiply(new BigInteger(String.valueOf(q+1))).divide(new BigInteger(String.valueOf(2))).multiply(new BigInteger(String.valueOf(C))));

            if(ans.compareTo(tmp)>0){
                ansN = i+1;
                ans = tmp;
            }
        }
        System.out.print(ansN+" "+ans);
    }
}