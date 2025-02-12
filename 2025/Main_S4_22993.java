import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        long A=Long.parseLong(st.nextToken());
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<N-1;i++)
            pq.add(Integer.parseInt(st.nextToken()));
        boolean ans=true;
        while(pq.size()>0){
            int tmp = pq.poll();
            if(pq.size()==0 && tmp==A)
                ans=false;
            if(A>tmp)
                A+=tmp;
            else if(A<tmp)
                ans=false;
        }
        System.out.print(ans?"Yes":"No");
    }
}