import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt(), Z=sc.nextInt(), M=sc.nextInt();
        Z-=1;
        boolean [] obstacles = new boolean[N];
        for(int i=0;i<M;i++)
            obstacles[sc.nextInt()-1]=true;
        int ans=0;
        for(int i=1;i<N;i++){
            boolean [] isVisited = new boolean[N];
            int cur=0;
            while(true){
                if(cur==Z) {
                    ans = i;
                    break;
                }
                if(obstacles[cur] || isVisited[cur]) {
                    break;
                }
                isVisited[cur]=true;
                cur = (cur+i)%N;
            }
            if(ans!=0)
                break;
        }
        System.out.println(ans);
    }
}