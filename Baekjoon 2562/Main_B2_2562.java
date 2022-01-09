package Bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_B2_2562 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int temp, max=-1, maxi=0;
		for(int i=0;i<9;i++) {
			temp = Integer.parseInt(br.readLine());
			if(temp>max) {
				max = temp;
				maxi=i;
			}
		}
		System.out.println(max+"\n"+(maxi+1));	
	}

}
