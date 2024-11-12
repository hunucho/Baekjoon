import java.util.*;

class Main_S5_19947 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr = new int [11];
		arr[0]=sc.nextInt();
		int Y=sc.nextInt();
		for(int i=1;i<=Y;i++) {
			arr[i]=(int)(1.05*arr[i-1]);
			if(i>=3)
				arr[i]=(int)Math.max(arr[i], 1.2*arr[i-3]);
			if(i>=5)
				arr[i]=(int)Math.max(arr[i], 1.35*arr[i-5]);
		}
		System.out.println(arr[Y]);
	}
}
