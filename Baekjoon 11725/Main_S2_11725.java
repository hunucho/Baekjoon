package silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main_S2_11725 {

	static ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
	static int [] ans;
	public static void dfs(int loc) {
		for(int k : arr.get(loc)) {
			if(ans[k]==0) {
				ans[k]=loc;
				dfs(k);
			}
		}
	}	
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		ans=new int [n+1];
		for(int i=0;i<=n;i++)
			arr.add(new ArrayList<>());
		for (int i = 0; i < n - 1; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			arr.get(a).add(b);
			arr.get(b).add(a);
		}
		dfs(1);
		
		for (int i = 2; i <= n; i++)
			bw.write( ans[i]+"\n");
		bw.close();
	}
}
