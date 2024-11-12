import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt(), ans=0;
        for(int i=1;i<=N;i++)
            if(i%f(i)==0)
                ans++;
        System.out.println(ans);
    }
    public static int f(int n){
        int ret=0;
        while(n>0) {
            ret += n %10;
            n/=10;
        }
        return ret;
    }
}
