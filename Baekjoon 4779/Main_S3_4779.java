package silver;

import java.util.*;

public class Main_S3_4779 {
	static boolean [] arr;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		while(sc.hasNextInt()) {
			int N=sc.nextInt();
			arr = new boolean [(int)Math.pow(3, N)];
			Arrays.fill(arr, true);
			Cantor(0,(int)Math.pow(3, N));
			arr[(int)Math.pow(3, N)-1]=true;
			for(boolean chk:arr)
				sb.append(chk?"-":" ");
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}
	 
	public static void Cantor(int p, int q) {
		if(p>=q || p<0 || q<0)
			return;
		for(int i=p+(q-p+1)/3;i<p+(q-p+1)*2/3;i++)
			arr[i]=false;
		Cantor(p,p+(q-p+1)/3-1);
		Cantor(p+((q-p+1)*2/3), q);		
	}
}
