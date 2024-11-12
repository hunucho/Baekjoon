package silver;

import java.awt.Point;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main_S1_2667 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine());
		int[][]arr = new int[n+2][n+2];
		int [] brr = new int[1000], dx= {1,-1,0,0}, dy= {0,0,1,-1};
		Queue<Point> qp = new LinkedList<Point>();
		PriorityQueue<Integer> qcnt = new PriorityQueue<>();
		for(int i=1;i<=n;i++)
		{
			String str=br.readLine();
			for(int j=1;j<=n;j++) {
				arr[i][j]=str.charAt(j-1)-'0';
			}
		}
		
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				int temp=0;
				if(arr[i][j]==1) {
					qp.add(new Point(i,j));
					arr[i][j]=0;
					temp=1;
				}				
				while(qp.size()>0) {
					Point cur=qp.poll();
					if(cur.x==0 || cur.x>n || cur.y==0 || cur.y>n)
						continue;
					for(int k=0;k<4;k++) {
						if(arr[cur.x+dx[k]][cur.y+dy[k]]==1) {
							qp.add(new Point(cur.x+dx[k],cur.y+dy[k]));
							arr[cur.x+dx[k]][cur.y+dy[k]]=0;
							temp++;
						}
					}
				}
				if(temp>0)
					qcnt.add(temp);
			}
		}
		bw.write(qcnt.size()+"\n");
		while(qcnt.size()>0)
			bw.write(qcnt.poll()+"\n");
		bw.close();
	}
}
