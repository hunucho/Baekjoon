import java.io.*;
import java.util.*;

class Main {
	public static class Student implements Comparable<Student>{
		String name;
		int rank;
		public Student(String name, int rank) {
			this.name=name;
			this.rank=rank;
		}
		@Override
		public int compareTo(Main.Student o) {
			return this.rank-o.rank;
		}
		
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		PriorityQueue<Student> pq = new PriorityQueue<>();
		PriorityQueue<String> ansq = new PriorityQueue<>();
		for(int i=0;i<N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String Name = st.nextToken();
			boolean Enrolled = st.nextToken().charAt(0)=='j'?true:false, Awardee = st.nextToken().charAt(0)=='w'?true:false;
			int S=Integer.parseInt(st.nextToken()), A=Integer.parseInt(st.nextToken());
			if(Enrolled && !Awardee && (S>3 || S==-1))
				pq.add(new Student(Name, A));
		}
		int ans=Math.min(pq.size(), 10);
		System.out.println(ans);
		for(int i=0;i<ans;i++)
			ansq.add(pq.poll().name);
		for(int i=0;i<ans;i++)
			System.out.println(ansq.poll());
	}
}
