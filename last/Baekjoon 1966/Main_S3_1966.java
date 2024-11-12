package silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_S3_1966 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		for(int test=0;test<t;test++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n=Integer.parseInt(st.nextToken());
			int m=Integer.parseInt(st.nextToken());
			int cnt=0;
			st=new StringTokenizer(br.readLine());
			int[] priority=new int [10];
			int[][] arr = new int[n][2];
			Queue<Integer> que = new LinkedList<>();
			
			for(int j=0;j<n;j++) {
				int temp=Integer.parseInt(st.nextToken());
				arr[j][1]=temp;
				priority[temp]++;
				que.add(j);
			}
			while(que.size()>0) {
				int sum=0;
				for(int i=arr[que.peek()][1]+1;i<=9;i++)
					sum+=priority[i];
				if(sum==0)
				{
					int temp=que.poll();
					priority[arr[temp][1]]--;
					cnt++;
					if(temp==m) {
						System.out.println(cnt);
						break;
					}
				}
				else {
					que.add(que.poll());
				}
			}
		}
	}
}
