import java.util.Scanner;

public class Main {
	
	static char [] signs;
	static int K;
	static boolean [] nums;
	static String max, min;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		K = sc.nextInt();
		signs = new char [K];
		nums = new boolean [10];
		max = "0";
		min = "9";
		for(int i=0;i<K;i++)
		signs[i] = sc.next().charAt(0);
		for(int i=0;i<10;i++)
			f(0,String.valueOf(i));
		System.out.println(max +" "+min);
	}
	
	static void f(int depth, String cur) {
		if(depth==K) {
			max = cur.compareTo(max)>0?cur:max;
			min = cur.compareTo(min)<0?cur:min;
		} else {
			int tmp = cur.charAt(depth)-'0';
			if(nums[tmp])
				return;
			nums[tmp]=true;
			if(signs[depth]=='>') {
				for(int i=tmp;i>=0;i--) {
					if(!nums[i])
						f(depth+1, cur+String.valueOf(i));
				}
			} else if(signs[depth]=='<') {
				for(int i=tmp;i<10;i++) {
					if(!nums[i])
						f(depth+1, cur+String.valueOf(i));
				}
			}
			nums[tmp]=false;
		}
	}
}
