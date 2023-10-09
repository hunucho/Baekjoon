import java.util.*;
public class Main {
    static int cntPrime, MAX=1000000;
    static boolean [] isPrime = new boolean[MAX+1];
    static int [] prime = new int [MAX];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        findPrime();
        int T=sc.nextInt();
        for(int t=0;t<T;t++){
            int N=sc.nextInt();
            int s=0, e=cntPrime-1, ans=0;
            while(s<=e){
                if(prime[s]+prime[e]==N)
                    ans++;
                if(prime[s]+prime[e]>N)
                    e--;
                else
                    s++;
            }
            System.out.println(ans);
        }

    }

    public static void findPrime() {
        Arrays.fill(isPrime, true);
        isPrime[0]=false;
        isPrime[1]=false;
        for(int i=2;i<=Math.sqrt(MAX);i++){
            if(isPrime[i]){
                for(int j=i*2;j<=MAX;j+=i){
                    isPrime[j]=false;
                }
            }
        }
        for(int i=0;i<=MAX;i++){
            if(isPrime[i])
                prime[cntPrime++]=i;
        }
    }
}
