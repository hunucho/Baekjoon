import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        for(int t=0;t<T;t++){
            int N=sc.nextInt(), cnt=0;
            char [] init = sc.next().toCharArray(), target = sc.next().toCharArray();
            int initW=0, targetW=0;
            for(int i=0;i<N;i++){
                if(init[i]=='W')
                    initW++;
                if(target[i]=='W')
                    targetW++;
                if(init[i]!=target[i])
                    cnt++;
            }
            int color = Math.abs(initW-targetW);
            System.out.println(color+(cnt-color)/2);
        }
    }
}