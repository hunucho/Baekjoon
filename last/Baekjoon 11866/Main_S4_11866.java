package silver;

import java.util.Scanner;

public class Main_S4_11866 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n=sc.nextInt(), k=sc.nextInt(), remaining=n,j=0;
		int [] arr = new int[n];
		for(int i=0;i<n;i++)
			arr[i]=i;
		sb.append("<");
		while(remaining>0) {
			int cnt=0;
			while(cnt<k) {
				if(arr[j]!=-1)
					cnt++;
				if(cnt==k)
					break;
				j++;
				j%=n;
			}
			sb.append((int)(j+1)+", ");
			arr[j]=-1;
			remaining--;
		}
		sb.delete(sb.length()-2, sb.length());
		sb.append(">");
		System.out.println(sb.toString());
	}
}