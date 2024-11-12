import java.io.*;
import java.util.*;

public class Main {
	static long [] arr, tree;
	
	static long initTree(int start, int end, int node) {
		if(start==end)
			return tree[node]=arr[start];
		int mid = (start+end)/2;
		return tree[node]=initTree(start, mid, node*2)+initTree(mid+1, end, node*2+1);
	}
	
	static long update(int start, int end, int node, int index, long value) {
		if(index<start || end<index)
			return tree[node];
		if(start == end)
			return tree[node]=value;
		int mid = (start + end)/2;
		long leftValue = update(start, mid, node*2, index, value);
		long rightValue = update(mid+1, end, node*2+1, index, value);
		return tree[node] = leftValue+rightValue;
	}
	
	static long query(int start, int end, int node, int left, long right) {
		if(right<start || end<left)
			return 0;
		if(left <=start && end <=right)
			return tree[node];
		int mid = (start+end)/2;
		long leftValue = query(start, mid, node*2, left, right);
		long rightValue = query(mid+1, end, node*2+1, left, right);
		return leftValue+rightValue;
	}
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken()), M=Integer.parseInt(st.nextToken()), K=Integer.parseInt(st.nextToken());
		arr = new long [N+1];
		tree = new long [4*N];
		for(int i=1;i<=N;i++)
			arr[i]=Long.parseLong(br.readLine());
		initTree(1, N, 1);
		for(int i=0;i<M+K;i++) {
			st = new StringTokenizer(br.readLine());
			int a=Integer.parseInt(st.nextToken()), b=Integer.parseInt(st.nextToken());
			long c=Long.parseLong(st.nextToken());
			if(a==1) {
				update(1,N,1,b,c);
			} else if(a==2) {
				System.out.println(query(1, N, 1, b, c));
			}
			
		}
	}
}
