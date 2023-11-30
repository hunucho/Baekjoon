import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt(), M=sc.nextInt();
		int [] arr = new int [N];
		for(int i=0;i<N;i++)
			arr[i]=sc.nextInt();
		Arrays.sort(arr);
		int l=0, r=N-1, ans=0;
		while(l<r) {
			if(arr[l]==0)
				l++;
			if(arr[r]==0)
				r--;
			if(arr[l]+arr[r]==M) {
				ans++;
				arr[l++]=arr[r--]=0;
			} else if(arr[l]+arr[r]>M) {
				r--;
			} else if(arr[l]+arr[r]<M) {
				l++;
			} 
		}
		System.out.println(ans);
	}
}
