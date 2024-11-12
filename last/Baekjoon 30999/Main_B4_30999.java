import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt(), M=sc.nextInt(), ans=0;
        for(int i=0;i<N;i++){
            String str=sc.next();
            int cnt=0;
            for(char ch:str.toCharArray())
                if(ch=='O')
                    cnt++;
            if(cnt>=M/2)
                ans++;
        }
        System.out.println(ans);
    }
}