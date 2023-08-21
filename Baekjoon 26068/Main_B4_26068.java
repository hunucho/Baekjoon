import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt(), ans=0;
        sc.nextLine();
        for(int i=0;i<N;i++){
            String s = sc.nextLine().substring(2);
            if(Integer.parseInt(s)<=90)
                ans++;
        }
        System.out.println(ans);
    }
}
