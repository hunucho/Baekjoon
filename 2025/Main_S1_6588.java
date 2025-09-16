import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws  Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> primeList = new ArrayList<>();
        boolean [] prime = new boolean [1000000];
        for(int i=2;i<1000000;i++){
            if(isPrime(i)) {
                primeList.add(i);
                prime[i]=true;
            }
        }
        int len = primeList.size();
        while(true){
            int N=Integer.parseInt(br.readLine());
            if(N==0)
                break;
            for(int i=0;i<len;i++){
                int tmp = primeList.get(i);
                if(N-tmp>=0 && prime[N-tmp]){
                    sb.append(N+" = "+Math.min(N-tmp, tmp)+" + "+Math.max(N-tmp, tmp)+"\n");
                    break;
                }
            }
        }
        System.out.print(sb);
    }
    static boolean isPrime(int n){
        for(int i=2;i<=Math.pow(n,0.5);i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
}
