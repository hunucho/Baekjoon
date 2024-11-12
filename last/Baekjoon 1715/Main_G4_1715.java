import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	PriorityQueue<Integer> pq = new PriorityQueue<>();
    	for(int i=0;i<N;i++)
    		pq.add(sc.nextInt());
    	int ans=0;
    	while(pq.size()>1){
    		int tmp = pq.poll()+pq.poll(); 
    		ans+=tmp;
    		pq.add(tmp);
    	}
    	System.out.println(ans);
    }
}
