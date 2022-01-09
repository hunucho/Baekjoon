package Bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_B3_1212 {

	static String[] arr=new String[]{"0","1","10","11","100","101","110","111"};
	static String[] brr=new String[] {"000","001","010","011","100","101","110","111"};
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader bs = new BufferedReader(new InputStreamReader(System.in));
		String n = bs.readLine();
		
		firstOctToBin(Integer.parseInt(n.substring(0,1)));
		for(int i=1;i<n.length();i++) {
			octToBin(Integer.parseInt(n.substring(i, i+1)));
		}
		
	}
	
	private static void firstOctToBin(int n) {
		
		System.out.print(arr[n]);
	}
	
	private static void octToBin(int n) {
		
		System.out.print(brr[n]);
	}
	
//	private static void firstOctToBin(int n) {
//		int out_temp = 1;
//		while(n>0) {
//			
//			out_temp+=n%2;
//			n/=2;
//			out_temp*=10;
//		}
//		System.out.println(out_temp);
//	}
//	
//	private static void octToBin(String c) {
//		int temp_value = Integer.parseInt(c);
//		String out_temp="";
//		for(int i=0;i<3;i++) {
//			out_temp+=String.valueOf(temp_value%2);
//			temp_value/=2;
//		}
//		
//		for(int i=0;i<3;i++) {
//			System.out.println(out_temp.charAt(2-i));
//		}
//	}
}
