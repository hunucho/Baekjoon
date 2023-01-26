import java.util.*;

public class Main {
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		int [] arr = new int [100005];
		Arrays.fill(arr, 999999);
		arr[2]=1;
		arr[4]=2;
		arr[5]=1;
		int n=sc.nextInt();
		for(int i=6;i<=n;i++) {
			int t2=999999, t5=999999;
			if(arr[i-5] != -1)
				t5=arr[i-5]+1;
			if(arr[i-2] != -1)
				t2=arr[i-2]+1;
			arr[i]=Math.min(t2, t5);			
		}
		System.out.println(arr[n]>100000?-1:arr[n]);
	}
}
	
