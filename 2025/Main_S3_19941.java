import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) throws  Exception{
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), K = sc.nextInt();
        String S = sc.next();
        Queue<Integer> P = new LinkedList<>();
        ArrayList<Integer> H = new ArrayList<>();
        for(int i=0;i<N;i++){
            if(S.charAt(i)=='P')
                P.add(i);
            else
                H.add(i);
        }
        int ans=0;
        while(P.size()>0){
            int p=P.poll();
            for(int i=0;i<H.size();i++){
                if(p-K <= H.get(i) && H.get(i) <= p+K){
                    ans++;
                    H.remove(i--);
                    break;
                }
                if(H.get(i)>p+K)
                    break;
            }
        }
        System.out.print(ans);
    }
}