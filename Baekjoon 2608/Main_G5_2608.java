import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String A=sc.next(), B=sc.next();
		int a=getDigit(A), b=getDigit(B);
		
		System.out.println(a+b);
		System.out.println(getRoman(a+b));

	}
	
	public static String getRoman(int N) {
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(1000, "M");
		hm.put(2000, "MM");
		hm.put(3000, "MMM");
		hm.put(900, "CM");
		hm.put(800, "DCCC");
		hm.put(700, "DCC");
		hm.put(600, "DC");
		hm.put(500, "D");
		hm.put(400, "CD");
		hm.put(300, "CCC");
		hm.put(200, "CC");
		hm.put(100, "C");
		hm.put(90, "XC");
		hm.put(80, "LXXX");
		hm.put(70, "LXX");
		hm.put(60, "LX");
		hm.put(50, "L");
		hm.put(40, "XL");
		hm.put(30, "XXX");
		hm.put(20, "XX");
		hm.put(10, "X");
		hm.put(9, "IX");
		hm.put(8, "VIII");
		hm.put(7, "VII");
		hm.put(6, "VI");
		hm.put(5, "V");
		hm.put(4, "IV");
		hm.put(3, "III");
		hm.put(2, "II");
		hm.put(1, "I");
		String ans = "";
		for(int i=1;i<=4;i++) {
			String ret =hm.get((int)((N%10)*Math.pow(10, i-1))); 
			ans = (ret==null?"":ret) + ans;
			N/=10;
		}
		return ans;
	}
	
	public static int getDigit (String S) {
		S = S+"    ";
		HashMap<String, Integer> hm = new HashMap<>();
		hm.put("MM", 2000);
		hm.put("M", 1000);
		hm.put("CM", 900);
		hm.put("DCCC", 800);
		hm.put("DCC", 700);
		hm.put("DC", 600);
		hm.put("D", 500);
		hm.put("CD", 400);
		hm.put("CCC", 300);
		hm.put("CC", 200);
		hm.put("C", 100);
		hm.put("XC", 90);
		hm.put("LXXX", 80);
		hm.put("LXX", 70);
		hm.put("LX", 60);
		hm.put("L", 50);
		hm.put("XL", 40);
		hm.put("XXX", 30);
		hm.put("XX", 20);
		hm.put("X", 10);
		hm.put("IX", 9);
		hm.put("VIII",8);
		hm.put("VII",7);
		hm.put("VI",6);
		hm.put("V",5);
		hm.put("IV",4);
		hm.put("III",3);
		hm.put("II",2);
		hm.put("I",1);
		
		int sum=0;
		for(int i=0;i<S.length()-4;i++) {
			for(int j=4;j>0;j--) {
				String sub=S.substring(i, i+j);
				if(hm.containsKey(sub)) {
					sum+=hm.get(sub);
					i+=j-1;
					break;
				}
			}
		}
		return sum;
	}
}
