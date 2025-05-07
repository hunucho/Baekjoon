import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        long D=Long.parseLong(st.nextToken());
        PriorityQueue<Integer> monster = new PriorityQueue<>(), equip = new PriorityQueue<>();
        int ans = 0;
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            int A=Integer.parseInt(st.nextToken());
            int X=Integer.parseInt(st.nextToken());
            if(A==1)
                monster.add(X);
            else
                equip.add(X);
        }
        while(monster.size()>0 || equip.size()>0){
            if(monster.size()>0 && D>monster.peek())
                D+=monster.poll();
            else if(equip.size()>0)
                D*=equip.poll();
            else
                break;
            ans++;
        }
        System.out.print(ans);
    }
}