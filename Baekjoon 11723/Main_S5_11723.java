package silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main_S5_11723 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int m = Integer.parseInt(br.readLine());
		boolean [] arr = new boolean [21], brr = new boolean[21], crr = new boolean[21];
		for(int i=1;i<=20;i++)
			brr[i]=true;
		for(int i=0;i<m;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String tmp=st.nextToken();
			if(tmp.equals("all")) {
				arr=brr;
				continue;
			}
			else if(tmp.equals("empty")) {
				arr=crr;
				continue;
			}
			int val=Integer.parseInt(st.nextToken());
			if(tmp.equals("add"))
				arr[val]=true;
			else if(tmp.equals("remove"))
				arr[val]=false;
			else if(tmp.equals("check"))
				bw.write(arr[val]?"1\n":"0\n");
			else if(tmp.equals("toggle"))
				arr[val]=!arr[val];
		}
		bw.close();
	}
}
