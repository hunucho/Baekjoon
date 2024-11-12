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
		Arrays.sort(boxes);	// 입력받은 택배의 갯수를 1.도착점 기준으로 정렬, 2.도착점이 동일하다면 출발점 기준으로 정렬
		int [] deli = new int[n+1];	// 최대 배송가능한 택배의 개수
		int ans=0;
		
		for(int i=0;i<m;i++) {
			int max=0;	// 택배배송 할 수 있는 최대 갯수
			// 이미 존재하는 택배 배송 가능 갯수를 알면 max에 저장
			for(int j=boxes[i].from;j<boxes[i].to;j++)
				max=Math.max(max, deli[j]);
			// 이동 범위를 탐색하면서 그 범위에서 최대 운송가능한 C를 넘지 않으면 운송이 가능한 최대 갯수를 찾을 수 있다.
			for(int j=boxes[i].from;j<boxes[i].to;j++)
				// 만약 현재 들고있는게 30개, 최대 운송수량이 40개, i에서의 갯수가 100개라면 추가적으로 가질수 있는 값은 10이다.
				// 40-30을해서 10개를 챙기도록 한다
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
			// 도착점이 동일하다면 출발점 증가하는 순서로 작성
			if(this.to==o.to)
				return this.from-o.from;
			// 도착점이 빠른곳 부터 느린곳 순서대로 증가
			return this.to-o.to;
		}
	}
}
