import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans=91;
        ans+=sc.nextInt();
        ans+=sc.nextInt()*3;
        ans+=sc.nextInt();
        System.out.printf("The 1-3-sum is %d",ans);
    }
}
