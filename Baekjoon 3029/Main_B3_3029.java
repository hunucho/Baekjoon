import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] t = new int [] {3600,60,1};
        int t1=0, t2=0;
        StringTokenizer st = new StringTokenizer(sc.nextLine(), ":");
        for(int i=0;i<3;i++)
            t1+=t[i]*Integer.parseInt(st.nextToken());
        st = new StringTokenizer(sc.nextLine(), ":");
        for(int i=0;i<3;i++)
            t2+=t[i]*Integer.parseInt(st.nextToken());
        int ans=t2-t1;
        if(ans<=0)
            ans+=86400;
        System.out.printf("%02d:%02d:%02d",ans/3600,(ans%3600)/60,ans%60);
    }
}
