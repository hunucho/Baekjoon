package gold;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_G3_8980 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n= Integer.parseInt(st.nextToken()), c = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(br.readLine());
		Box [] boxes = new Box [m];
		for(int i=0;i<m;i++) {
			st = new StringTokenizer(br.readLine());
			int from = Integer.parseInt(st.nextToken());
			int to = Integer.parseInt(st.nextToken());
			int amount = Integer.parseInt(st.nextToken());
			boxes[i]=new Box(from, to, amount);
		}
		Arrays.sort(boxes);
		int [] deli = new int[n+1];
		int ans=0;
		
		for(int i=0;i<m;i++) {
			int max=0;
			for(int j=boxes[i].from;j<boxes[i].to;j++)
				max=Math.max(max, deli[j]);
			for(int j=boxes[i].from;j<boxes[i].to;j++)
				deli[j]+=Math.min(boxes[i].amount, c-max);
			ans+=Math.min(boxes[i].amount, c-max);
		}
		System.out.println(ans);
	}
	
	static class Box implements Comparable<Box>{
		int from, to, amount;

		public Box(int from, int to, int amount) {
			this.from = from;
			this.to = to;
			this.amount = amount;
		}

		@Override
		public int compareTo(Box o) {
			if(this.to==o.to)
				return this.from-o.from;
			return this.to-o.to;
		}
	}
}
