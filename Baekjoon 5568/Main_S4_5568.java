import java.io.*;
import java.util.*;

class Main {
	static HashSet<String> hs;
	static String [] nums;
	static int n, k;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(br.readLine());
		k=Integer.parseInt(br.readLine());
		nums = new String [n];
		hs = new HashSet<>();
		for(int i=0;i<n;i++)
			nums[i] = br.readLine();
		Permutation(0, new boolean [n], "");
		System.out.println(hs.size());
	}
	
	public static void Permutation(int depth, boolean [] chk, String str) {
		if(depth==k) {
			hs.add(str);
			return;
		} 
		for(int i=0;i<n;i++) {
			if(!chk[i]) {
				chk[i]=true;
				Permutation(depth+1, chk, str+nums[i]);
				chk[i]=false;
			}
		}
	}
}
