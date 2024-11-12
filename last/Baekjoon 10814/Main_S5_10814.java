package silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_S5_10814 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		String[] arr=new String[201];
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			int age=Integer.parseInt(st.nextToken());
			if(arr[age]==null)
				arr[age]="";
			arr[age]=arr[age].concat(st.nextToken()+" ");
		}
		for(int i=0;i<201;i++) {
			if(arr[i]!=null) {
				st = new StringTokenizer(arr[i]);
				while(st.hasMoreTokens()) {
					System.out.print(i+" ");
					System.out.println(st.nextToken());
				}
			}
		}
	}

}
