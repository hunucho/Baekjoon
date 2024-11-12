package silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main_S1_1946 {
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		for(int tc=0;tc<T;tc++) {
			int n=Integer.parseInt(br.readLine());
			int [] paper = new int [n+1];	// 서류점수의 등수대로 면접 점수를 넣는다.
			// 동일 등수가 없기 때문에, 각 등수에는 하나의 등수만 들어간다.
			for(int i=0;i<n;i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int s1=Integer.parseInt(st.nextToken());
				int s2=Integer.parseInt(st.nextToken());
				paper[s1]=s2;
			}
			// 면접점수의 1등의 서류점수를 기준으로 이것보다 높은(값이 낮은 등수) 값이 있다면, 그 지원자는 서류점수는 이겼기 떄문에 선발된다. 
			int max=paper[1], ans=0;
			for(int i=1;i<=n;i++) {
				if(paper[i]<=max) {	// 전체를 찾으면서 등수가 높아지는 사람이 있다면 (숫자가 낮아짐)
					max=paper[i];	// 이후에 오는 사람은 찾아진 사람을 이겨야하기에, 비교값을 바꿔준다.
					ans++;
				}
			}
			bw.write(ans+"\n");
		}
		bw.close();
	}
	
//	public static void main(String[] args) throws Exception{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		int T = Integer.parseInt(br.readLine());
//		for(int tc=0;tc<T;tc++) {
//			
//			int n=Integer.parseInt(br.readLine());
//			Sinip [] sinip = new Sinip[n];
//			for(int i=0;i<n;i++) {
//				StringTokenizer st = new StringTokenizer(br.readLine());
//				int s1=Integer.parseInt(st.nextToken());
//				int s2=Integer.parseInt(st.nextToken());
//				sinip[i]=new Sinip(s1, s2);
//			}
//			Arrays.sort(sinip);
//			int max=sinip[0].interview, ans=0;
//			for(int i=0;i<n;i++) {
//				if(sinip[i].interview<=max) {
//					ans++;
//					max=sinip[i].interview;
//				}
//			}
//			bw.write(ans+"\n");
//		}
//		bw.close();
//	}
//	
//	static class Sinip implements Comparable<Sinip>{
//		int paper, interview;
//		public Sinip(int paper, int interview) {
//			this.paper = paper;
//			this.interview = interview;
//		}
//
//		@Override
//		public int compareTo(Sinip o) {
//			return this.paper-o.paper;
//		}
//	}
}
