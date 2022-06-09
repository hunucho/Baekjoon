package silver;

import java.util.*;

public class Main_S1_1821 {
	static int n,f;
	static boolean done;
	static boolean[] chk;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		f=sc.nextInt();
		chk = new boolean[n+1];
		permu(new int[n],0);
	}
	// 순열을 이용하여 가장 윗줄에서 만들 수 있는 모든 경우의 수를 만들어준다.
	public static void permu(int [] num,int depth) {
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
				permu(num,depth+1);
				if(done)	// 이미 완료됬다면 더이상 탐색을 하지 않기 위해 종료
					return;
				chk[i]=false;
			}			
		}
	}
	// 재귀 형태로 모든 값을 더해가면서 가장 밑줄의 값을 구함
	public static boolean check(int [] num,int len) {
		if(len==1) {
			if(num[0]==f)
				return true;
			return false;
		}
		int [] temp = new int[len-1];
		for(int i=0;i<len-1;i++)
			temp[i]+=num[i];
		for(int i=1;i<len;i++)
			temp[i-1]+=num[i];
		return check(temp, len-1);
	}
}
