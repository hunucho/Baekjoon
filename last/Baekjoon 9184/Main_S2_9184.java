package silver;

import java.util.*;

public class Main_S2_9184 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		StringBuilder sb=new StringBuilder();
		int [][][] arr = new int [25][25][25];
		for(int i=0;i<=20;i++) {
			for(int j=0;j<=20;j++) {
				for(int k=0;k<=20;k++) {
					if(i==0 || j==0 || k==0)
						arr[i][j][k]=1;
					else
						arr[i][j][k]=arr[i-1][j][k]+arr[i-1][j-1][k]+arr[i-1][j][k-1]-arr[i-1][j-1][k-1];
				}
			}					
		}
		while(true) {
			int a=sc.nextInt(), b=sc.nextInt(),c=sc.nextInt();
			if(a==-1 && b==-1 && c==-1)
				break;
			sb.append("w("+a+", "+b+", "+c+") = ");
			if(a<1 || b<1 || c<1)
				a=b=c=0;
			else if(a>20 || b>20 || c>20)
				a=b=c=20;
			sb.append(arr[a][b][c]+"\n");
		}
		System.out.println(sb.toString());
	}
}
