import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken()), M=Integer.parseInt(st.nextToken());
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<M;i++)
            pq.add(Integer.parseInt(br.readLine()));
        int ansPrice=0, ansProfit=0, price=0, profit=0, cnt=0;
        while(pq.size()>0 && cnt<N){
            price=pq.poll();
            cnt++;
            profit = price*cnt;
            if(profit>ansProfit){
                ansPrice = price;
                ansProfit = profit;
            }
        }
        System.out.println(ansPrice+" "+ ansProfit);
    }
}