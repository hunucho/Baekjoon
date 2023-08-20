import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt(), M=sc.nextInt();
        int h=0, b=0;
        for(int i=0;i<N;i++)
            h=Math.max(h,sc.nextInt());
        for(int i=0;i<M;i++)
            b=Math.max(b,sc.nextInt());
        System.out.println(h+b);
    }
}
