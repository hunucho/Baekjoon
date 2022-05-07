package silver;
import java.util.*;
public class Main_S3_2193 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		long [] a=new long[n+9];
		a[1]=1;
		for(int i=2;i<=n;i++)
			a[i]=a[i-1]+a[i-2];
		System.out.println(a[n]);
		
	}
}