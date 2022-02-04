package silver;

import java.util.Scanner;

public class Main_S4_1244 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		boolean [] arr=new boolean[n];
		for(int i=0;i<n;i++) {
			int tmp=sc.nextInt();
			if(tmp==1)
				arr[i]=true;
		}
		
		int t=sc.nextInt();
		for(int i=0;i<t;i++) {
			int sex=sc.nextInt(), sw=sc.nextInt();
			if(sex==1)
				for(int j=sw-1;j<n;j+=sw) {
					arr[j]=!arr[j];
				}
			else if(sex==2) {
				int j=0;
				sw--;
				while(sw-j>=0 && sw+j<n) {
					if(arr[sw+j]==arr[sw-j])
						arr[sw+j]=arr[sw-j]=!arr[sw+j];
					else
						break;
					j++;
				}
			}
		}
		for(int i=1;i<=n;i++) {
			
			if(arr[i-1])
				System.out.print("1");
			else
				System.out.print("0");
			if(i%20==0)
				System.out.println();
			else
				System.out.print(" ");
		}
	}
}
