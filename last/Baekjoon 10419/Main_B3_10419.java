import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        for(int tc=0;tc<T;tc++){
            int t=sc.nextInt(), ans=0;
            for(int i=0;i<t;i++)
                if(t>=i*i+i)
                    ans=i;
            System.out.println(ans);
        }
    }
}
