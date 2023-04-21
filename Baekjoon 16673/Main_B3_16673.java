import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int C=sc.nextInt(), K=sc.nextInt(), P=sc.nextInt(), ans=0;
        for(int i=1;i<=C;i++)
            ans+=K*i+P*i*i;
        System.out.println(ans);
    }
}
