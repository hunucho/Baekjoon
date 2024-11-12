package bronze;


import java.io.*;

public class Main_B3_2576 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum=0, min=999;
		for(int i=0;i<7;i++) {
			int tmp=Integer.parseInt(br.readLine());
			if(tmp%2==1) {
				sum+=tmp;
				min=Math.min(tmp, min);
			}
		}
		if(min==999)
			System.out.println(-1);
		else
			System.out.println(sum+"\n"+min);
			
	}
}
