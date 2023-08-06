import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken()), M=Integer.parseInt(st.nextToken());
        int [] dp = new int[N+1];
        LinkedList<HashSet<Integer>> in = new LinkedList<>(), out = new LinkedList<>();
        Queue<Integer> q=new LinkedList<>();

        for(int i=0;i<=N;i++) {
            in.add(new HashSet<>());
            out.add(new HashSet<>());
        }

        for(int i=0;i<M;i++){
            st=new StringTokenizer(br.readLine());
            int A=Integer.parseInt(st.nextToken()), B=Integer.parseInt(st.nextToken());
            out.get(A).add(B);
            in.get(B).add(A);
        }

        for(int i=1;i<=N;i++) {
            if (in.get(i).size() == 0) {
                dp[i] = 1;
                q.add(i);
            }
        }

        while(q.size()>0) {
            int cur=q.poll();
            for(int j:out.get(cur)) {
                in.get(j).remove(cur);
                if (in.get(j).size() == 0) {
                    dp[j] = dp[cur]+1;
                    q.add(j);
                }
            }
        }

        for(int i=1;i<=N;i++)
            System.out.print(dp[i]+" ");
    }
}
