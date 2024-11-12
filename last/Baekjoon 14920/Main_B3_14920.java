import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(), cnt=1;
        while(n!=1) {
            if(n%2==0)
                n/=2;
            else
                n=n*3+1;
            cnt++;
        }
        System.out.println(cnt);
    }
}
