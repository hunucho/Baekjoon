import java.util.*;

public class Main_B1_2435 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(), k=sc.nextInt(), tmp=0, ans;
		int [] arr = new int [n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		for(int i=0;i<k;i++)
			tmp+=arr[i];
		ans=tmp;
		for(int i=1;i<n-k+1;i++) {
			tmp=tmp-arr[i-1]+arr[i-1+k];
			ans=Math.max(ans, tmp);
		}
		System.out.println(ans);
	}
}
