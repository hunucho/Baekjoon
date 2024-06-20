import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int [] num = new int [1000];
		int idx=0;
		for(int i=2;i<3000;i++) {
			boolean chk=true;
			for(int j=2;j<=Math.pow(i, 0.5);j++)
				if(i%j==0)
					chk=false;
			if(chk)
				num[idx++]=i;
		}
		int T=sc.nextInt();
		for(int t=0;t<T;t++) {
			int K=sc.nextInt();
			boolean chk=true;
			for(int i=0;i<idx && chk;i++) {
				for(int j=i;j<idx && chk;j++) {
					for(int k=j;k<idx && chk;k++) {
						if(num[i]+num[j]+num[k]==K) {
							sb.append(num[i]+" "+num[j]+" "+num[k]+"\n");
							chk=false;
						}
					}
				}
			}
		}
		System.out.println(sb);
	}	
}
