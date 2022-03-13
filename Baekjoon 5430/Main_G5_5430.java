package gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_G5_5430 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sbw = new StringBuilder();
		int test = Integer.parseInt(br.readLine());	// set test case
		for(int test_case=0;test_case<test;test_case++) {
			String op = br.readLine();		// input for p
			int n = Integer.parseInt(br.readLine());	// input for length of array
			StringBuilder sb = new StringBuilder();		// convert input data to string array
			sb.append(br.readLine());			
			sb.setLength(sb.length()-1);
			sb.delete(0, 1);
			String [] temp = sb.toString().split(",");
			
			int s=0, e=n;
			boolean error=false, reversed=false;
			
			for(int i=0;i<op.length();i++) {
				if(op.charAt(i)=='R')			// when op is 'R' 
					reversed=!reversed;		// determine is reversed or not
				else if(op.charAt(i)=='D') {
					if(!reversed)		// calc like deQueue
						s++;
					else
						e--;
					if(s>e) {		// when it doesn't have any element
						error=true;		// it will be error
						break;
					}
				}
			}
			
			if(!error) {
				sbw.append("[");
				if(!reversed)
					for(int i=s;i<e;i++)
						sbw.append(temp[i]).append(',');
				else
					for(int i=e-1;i>=s;i--)
						sbw.append(temp[i]).append(',');
				if(sbw.charAt(sbw.length()-1)==',')		// only sbw finish with ,(comma) delete it
					sbw.setLength(sbw.length()-1);
				sbw.append("]\n");
			}
			else
				sbw.append("error\n");
		}
		System.out.println(sbw.toString());
	} 
}
