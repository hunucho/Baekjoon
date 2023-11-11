import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt(), ans=0;
        int [] cows = new int[11];
        Arrays.fill(cows,-1);
        for(int i=0;i<N;i++){
            int cow=sc.nextInt(), loc=sc.nextInt();
            if(cows[cow]==-1)
                cows[cow]=loc;
            else if(cows[cow]!=loc) {
                cows[cow]=loc;
                ans++;
            }
        }
        System.out.println(ans);
    }
}
