import java.util.*;

public class Main_B2_2484 {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt(), ans=0;
		for(int t=0;t<T;t++) {
			int temp=0;
			int [] arr = new int[4];
			for(int i=0;i<4;i++)
				arr[i]=sc.nextInt();
			Arrays.sort(arr);
			if(arr[0]==arr[3])
				temp=50000+5000*arr[0];
			else if(arr[1]==arr[3] || arr[0]==arr[2])
				temp=10000+1000*arr[1];
			else if(arr[0]==arr[1] && arr[2]==arr[3])
				temp=2000+(arr[0]+arr[2])*500;
			else if(arr[0]==arr[1] || arr[1]==arr[2])
				temp=1000+arr[1]*100;
			else if(arr[2]==arr[3])
				temp=1000+arr[2]*100;
			else
				temp=arr[3]*100;
			ans=Math.max(ans, temp);
		}
		System.out.println(ans);
	}
}
