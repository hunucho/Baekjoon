import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N=sc.nextLong(), ans=0, i=0;
        while(i<=N*N){
            ans+=(i%N==i/N)?i:0;
            i+=N+1;
        }
        System.out.println(ans);
    }
}
