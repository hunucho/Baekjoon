package silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_S5_1316 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int cnt=0;
		for(int i=0;i<n;i++) {
			boolean[] arr=new boolean[26];
			String s = br.readLine();
			
			boolean chk=true;
			char prev=s.charAt(0);
			arr[s.charAt(0)-'a']=true;
			for(int j=1;j<s.length();j++) {
				if(arr[s.charAt(j)-'a']==false) {
					prev=s.charAt(j);
					arr[s.charAt(j)-'a']=true;
				}
				else if(arr[s.charAt(j)-'a']) {
					if(s.charAt(j)==prev)
						continue;
					else {
						chk=false;
						break;
					}
				}
			}
			if(chk)
				cnt++;
		}
		System.out.println(cnt);
	}
}
