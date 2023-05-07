package silver;

import java.util.*;

public class Main_S4_1015 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt(), cnt=0, max=0;
		int [] A = new int [N], B=new int [N];
		for(int i=0;i<N;i++) {
			A[i]=sc.nextInt();
			max=Math.max(max, A[i]);
		}
		for(int i=1;i<=max;i++)
			for(int j=0;j<N;j++)
				if(A[j]==i)
					B[j]=cnt++;
		for(int i=0;i<N;i++)
			System.out.print(B[i]+" ");
	}
}
