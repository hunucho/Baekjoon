import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int U=sc.nextInt(), N=sc.nextInt();
        HashMap<Integer, String> hm = new HashMap<>();
        int [] cnt = new int [U+1];
        boolean done=false;
        String ans="";
        for(int i=0;i<N;i++){
            String name=sc.next();
            int price = sc.nextInt();
            hm.putIfAbsent(price, name);
            cnt[price]++;
        }
        int min=999999, mincnt=0;
        for(int i=1;i<=U;i++){
            if(cnt[i]==1) {
                ans=hm.get(i)+" "+i;
                done=true;
                break;
            }
        }
        if(!done) {
            for (int i = 1; i <= U; i++)
                if (cnt[i] > 0) {
                    if(cnt[i]==min)
                        mincnt++;
                    else if(cnt[i]<min){
                        min = cnt[i];
                        mincnt=1;
                        ans = hm.get(i) + " " + i;
                    }
                }
        }
        System.out.print(ans);
    }
}