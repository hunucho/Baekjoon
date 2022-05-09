package bronze;

import java.util.Scanner;

public class Main_B2_1076 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long ans=0;
		String [] colors = {"black","brown","red","orange","yellow","green","blue","violet","grey","white"};
		
		for(int j=0;j<2;j++) {
			String str=sc.nextLine();
			for(int i=0;i<colors.length;i++)
				if(str.equals(colors[i])) {
					ans*=10;
					ans+=i;
					break;
				}
		}
		String str=sc.nextLine();
		for(int i=0;i<colors.length;i++)
			if(str.equals(colors[i]))
				ans*=Math.pow(10, i);
		System.out.println(ans);
	}

}
