import java.util.*;

public class Main {
    static ArrayList<Integer>[] al;
    static int n, ans=-1;
    static boolean [] chk;
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        int from=sc.nextInt(), to=sc.nextInt(), m=sc.nextInt();
        al = new ArrayList[n+1];
        chk = new boolean[n+1];
        for(int i=1;i<=n;i++)
            al[i]=new ArrayList<>();
        for(int i=0;i<m;i++){
            int x=sc.nextInt(), y=sc.nextInt();
            al[x].add(y);
            al[y].add(x);
        }

        bfs(from, to, 0);
        System.out.println(ans);
    }
    public static void bfs (int start, int end, int cnt){
        if(start==end){
            ans=cnt;
            return;
        }
        if (!chk[start]){
            chk[start]=true;
            for(int i=0;i<al[start].size();i++){
                bfs(al[start].get(i),end,cnt+1);
            }
        }
    }
}
