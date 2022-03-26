package gold;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main_G2_1655 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		PriorityQueue<Integer> minq = new PriorityQueue<Integer>(), maxq = new PriorityQueue<Integer>(new Comparator<Integer>() {
			// minq 에 큰값을 넣고, maxq 에 작은 값을 넣음, 항상 maxq의 값이 커야함
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2-o1;
			}
		});
		int n= Integer.parseInt(br.readLine()), mid=Integer.MAX_VALUE;
		for(int i=0;i<n;i++) {
			int t=Integer.parseInt(br.readLine());
			if(t>mid) {
				minq.add(t);
				if(maxq.size()<minq.size())
					maxq.add(minq.poll());
			}
			else {
				maxq.add(t);
				if(maxq.size()>minq.size()+1)
					minq.add(maxq.poll());
			}
			
			mid=maxq.peek();
			bw.write(mid+"\n");
		}
		bw.close();
	}
}
