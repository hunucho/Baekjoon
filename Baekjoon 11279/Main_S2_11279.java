package silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;

public class Main_S2_11279 {

	public static void main(String[] args) throws Exception{
		PriorityQueue<Integer> q = new PriorityQueue<Integer>((o1,o2) -> o2-o1);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++)
		{
			int sw=Integer.parseInt(br.readLine());
			if(sw==0) {
				if(q.isEmpty())
					bw.write(0+"\n");
				else
					bw.write(q.poll()+"\n");
			}
			else
				q.offer(sw);
		}
		bw.close();
	}
}