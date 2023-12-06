import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K=sc.nextInt();
		for(int k=1;k<=K;k++) {
			System.out.println("Class "+k);
			int N=sc.nextInt(), gap=0;
			int [] arr=new int [N];
			for(int i=0;i<N;i++)
				arr[i]=sc.nextInt();
			Arrays.sort(arr);
			for(int i=1;i<N;i++) 
				if(gap<Math.abs(arr[i]-arr[i-1]))
					gap=Math.abs(arr[i]-arr[i-1]);
			System.out.printf("Max %d, Min %d, Largest gap %d\n", arr[N-1], arr[0], gap);
		}
	}	
}
