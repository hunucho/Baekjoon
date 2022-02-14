package bronze;

import java.util.Scanner;

public class Main_B2_3040 {
	static int[] dwarf=new int[9], cur=new int[7];

	public static void combination(int cnt, int start) {
		if(cnt==7) {
			int sum=0;
			for(int i=0;i<7;i++)
				sum+=dwarf[cur[i]];
			if(sum==100)
				for(int i=0;i<7;i++)
					System.out.println(dwarf[cur[i]]);
			return;
		}
		for(int i=start;i<9;i++) {
			cur[cnt]=i;
			combination(cnt+1, i+1);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<9;i++)
			dwarf[i]=sc.nextInt();
		combination(0, 0);
	}
}