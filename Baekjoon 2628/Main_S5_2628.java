package silver;

import java.util.Arrays;
import java.util.Scanner;

public class Main_S5_2628 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in); 
		int m=sc.nextInt(), n=sc.nextInt();
		int k=sc.nextInt();
		int [] h=new int [k+1], w=new int [k+1];
		int[] rh =new int[k+1], rw = new int[k+1];
		h[0]=n;
		w[0]=m;
		for(int i=1;i<=k;i++)
		{
			if(sc.nextInt()==0)
				h[i]=sc.nextInt();
			else
				w[i]=sc.nextInt();
		}
		Arrays.sort(h);
		Arrays.sort(w);
		for(int i=0;i<k;i++) {
			rh[i]=h[i+1]-h[i];
			rw[i]=w[i+1]-w[i];
		}
		Arrays.sort(rh);
		Arrays.sort(rw);
		System.out.println(rh[rh.length-1]*rw[rw.length-1]);
	}
}
