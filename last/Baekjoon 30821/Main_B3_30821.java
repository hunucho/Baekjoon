import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long ans=1;
        for(int i=0;i<5;i++)
            ans*=N-i;
        for(int i=0;i<5;i++)
            ans/=(i+1);
        System.out.println(ans);
    }
}