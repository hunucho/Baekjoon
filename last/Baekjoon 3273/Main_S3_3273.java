import java.util.*;

public class Main_S3_3273 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int x=sc.nextInt(), ans=0;
		Arrays.sort(arr);
		int s=0, e=n-1;
		while(s<e) {
			if(arr[s]+arr[e]==x)
				ans++;
			if(arr[s]+arr[e]>x)
				e--;
			else
				s++;			
		}
		System.out.println(ans);
	}
}
