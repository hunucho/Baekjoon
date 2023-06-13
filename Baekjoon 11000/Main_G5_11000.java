import java.io.*;
import java.util.*;

public class Main {
	static class Schedule implements Comparable<Schedule>{
		private int S;
		private int T;
		
		@Override
		public int compareTo(Main.Schedule o) {
			return this.S-o.S;
		}

		public int getS() {
			return S;
		}

		public int getT() {
			return T;
		}

		public Schedule(int s, int t) {
			S = s;
			T = t;
		}
	}
    public static void main(String[] args) throws Exception{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine()), ans=0;
        List<Schedule> list = new ArrayList<>();
        for(int i=0;i<N;i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	list.add(new Schedule(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())));
        }
        Collections.sort(list);
        PriorityQueue<Integer> pq = new PriorityQueue<>();        
        for(Schedule sd:list)
        	if(pq.size()==0 || pq.peek()>sd.getS()) {
        		pq.add(sd.getT());
        		ans = Math.max(ans, pq.size());
        	} else {
        		pq.poll();
        		pq.add(sd.getT());
        	}
        System.out.println(ans);
    }
}
