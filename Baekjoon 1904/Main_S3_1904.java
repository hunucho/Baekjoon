import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int [] p=new int [1000001];
        p[1]=1;
        p[2]=2;
        for(int i=3;i<=N;i++)
            p[i]=(p[i-2]+p[i-1])%15746;
        System.out.println(p[N]);
    }
}
