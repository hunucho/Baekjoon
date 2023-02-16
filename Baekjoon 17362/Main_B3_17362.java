import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), ans=0;
        if(n<=5)
            ans=n;
        else{
            n-=6;
            if((n/4)%2==0)
                ans=4-n%4;
            else
                ans=n%4+2;
        }
        System.out.println(ans);
    }
}
