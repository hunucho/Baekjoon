import java.io.*;
import java.util.*;

class Main {
	
	static int [] arr;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		HashMap<Integer, Integer> hm =  new HashMap<>();
		int N=0, ans=0;
		for(int i=0;i<4;i++)
			N = N*10 + Integer.parseInt(st.nextToken());
		arr = new int [10000];
		for(int i=1111;i<=9999;i++)
			makeNum(i);
		N = getSmall(N);
		for(int i=1111;i<N;i++) {
			if(arr[i]!=0)
				ans++;
		}
		System.out.println(ans+1);
	}
	
	public static int getSmall(int N) {
		int min = 99999;
		for(int i=0;i<4;i++) {
			int tmp = N%10;
			N/=10;
			N+=1000*tmp;
			min = Math.min(min, N);
		}
		return min;
	}
	
	public static void makeNum(int N) {
		int tmpN = N;
		for(int i=0;i<4;i++) {
			int tmp = tmpN%10;
			tmpN/=10;
			if(tmp==0)
				return;
		}
		arr[getSmall(N)]=1;
		
	}
}
