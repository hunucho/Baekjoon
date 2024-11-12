import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt(), d=sc.nextInt(), a=0;
        for(int i=1, t;i<=N;i++) {
            t=i;
            while(t>0) {
                a+=t%10==d?1:0;
                t/=10;
            }
        }
        System.out.println(a);
    }
}