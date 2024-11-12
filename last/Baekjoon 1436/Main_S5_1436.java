package silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_S5_1436 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int i=666, cnt=1, tmp=0;
		
		while(cnt<n) {
			i++;
			tmp=i;
			while(tmp>=666) {
				if(tmp%1000==666) {
					cnt++;
					break;
				}
				tmp/=10;
			}
		}
		/* 처음 코드 메모리초과 문제가 생겼다.
		 * while(cnt<n) 
		 * { 
		 * 		i++; 
		 * 		tmp=String.valueOf(i); 
		 * 		for(int j=0;j<=tmp.length()-3;j++) { 
		 * 			if(tmp.substring(j,j+3).compareTo("666")==0) { 
		 * 				cnt++; 
		 * 				break; 
		 * 			}
		 * 		} 
		 * }
		 */
		System.out.println(i);
	}

}
