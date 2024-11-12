import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt(), M=sc.nextInt(), ans=0, len=N;
        Deque<Integer> dq = new ArrayDeque<>();
        for(int i=1;i<=N;i++)
            dq.add(i);
        for(int i=0;i<M;i++) {
            int target = sc.nextInt();
            if(dq.peekFirst()==target) {
                dq.pollFirst();
                len--;
            }
            else {
                int tmp = 0;
                while (dq.peekFirst() != target) {
                    dq.addLast(dq.pollFirst());
                    tmp++;
                }
                ans += Math.min(tmp, len - tmp);
                dq.pollFirst();
                len--;
            }
        }
        System.out.println(ans);
    }
}
