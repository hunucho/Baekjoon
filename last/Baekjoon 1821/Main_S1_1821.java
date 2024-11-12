package silver;

import java.util.*;

public class Main_S1_1821 {
	static int n,f;
	static boolean done;
	static int [] num;
	static boolean[] chk;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		f=sc.nextInt();
		chk = new boolean[n+1];
		num = new int[n];
		permu(0);
	}

	public static void permu(int depth) {
		if(depth==n){
			if(done=check(num,n))
				for(int i=0;i<n;i++)
				System.out.print(num[i]+" ");
			return;
		}
		for(int i=1;i<=n;i++) {
			if(!chk[i]) {
				num[depth]=i;
				chk[i]=true;
				permu(depth+1);
				if(done)
					return;
				chk[i]=false;
			}			
		}
	}
	
	public static boolean check(int [] num,int len) {
		int [] temp = new int[len];
		for(int i=0;i<len;i++)
			temp[i]=num[i];
		for(int i=len-1;i>=0;i--) {
			for(int j=0;j<i;j++)
				temp[j]=temp[j]+temp[j+1];
		}
		if(temp[0]==f)
			return true;
		return false;
	}
}
