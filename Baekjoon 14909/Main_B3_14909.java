import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans=0;
        StringTokenizer st = new StringTokenizer(sc.nextLine());
        while(st.hasMoreTokens())
            if(Integer.parseInt(st.nextToken())>0)
                ans++;
        System.out.println(ans);
    }
}
