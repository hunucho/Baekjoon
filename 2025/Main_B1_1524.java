import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws  Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());
        for(int t=0;t<T;t++){
            br.readLine();
            StringTokenizer st= new StringTokenizer(br.readLine());
            int N=Integer.parseInt(st.nextToken()), M=Integer.parseInt(st.nextToken());
            PriorityQueue<Integer> S=new PriorityQueue<>(), B=new PriorityQueue<>();
            st = new StringTokenizer(br.readLine());
            for(int i=0;i<N;i++)
                S.add(Integer.parseInt(st.nextToken()));
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<M;j++)
                B.add(Integer.parseInt(st.nextToken()));
            while(S.size()>0 && B.size()>0){
                if(S.peek()<B.peek())
                    S.poll();
                else
                    B.poll();
            }
            System.out.println(S.size()>B.size()?"S":"B");
        }
    }
}