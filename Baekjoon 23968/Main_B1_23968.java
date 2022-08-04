import java.io.*;
import java.util.*;

public class Main_B1_23968 {
	static int n, k;
	static String ans="";
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n=Integer.parseInt(st.nextToken());
		k=Integer.parseInt(st.nextToken());
		int [] a = new int[n+1];
		st = new StringTokenizer(br.readLine());
		for(int i=1;i<=n;i++)
			a[i]=Integer.parseInt(st.nextToken());
		bubble_sort(a);
		
		System.out.println(ans);
	}
	public static void bubble_sort(int [] a) {
		int cnt=0;
		for(int last=n;last>=2;last--) {
			for(int i=1;i<=last-1;i++)
				if(a[i]>a[i+1]) {
					int temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
					cnt++;
					if(cnt==k) {
						ans=a[i]+" "+a[i+1];
						return;
					}
				}
		}
		ans="-1";
	}
}
