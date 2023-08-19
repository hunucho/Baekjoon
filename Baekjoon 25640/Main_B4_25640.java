import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int N=sc.nextInt(), ans=0;
        sc.nextLine();
        for(int i=0;i<N;i++){
            if(S.equals(sc.nextLine()))
                ans++;
        }
        System.out.println(ans);
    }
}
