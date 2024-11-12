package silver;

import java.util.*;

public class Main_S4_2960 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(), k=sc.nextInt(), cnt=0;
		boolean[] chk=new boolean[n+1];
		for(int i=2;i<=n;i++)
			for(int j=1;i*j<=n;j++)
				if(chk[i*j]==false) {
					chk[i*j]=true;
					cnt++;
					if(cnt==k)
						System.out.println(i*j);
				}		
	}
}
