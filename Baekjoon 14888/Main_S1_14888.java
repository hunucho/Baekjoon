package silver;

import java.io.*;
import java.util.*;

public class Main_S1_14888 {
	static int max=Integer.MIN_VALUE, min=Integer.MAX_VALUE, n;
	static int [] nums, ops;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(br.readLine());
		nums = new int[n];
		ops = new int[4];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++)
			nums[i]=Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<4;i++)
			ops[i]=Integer.parseInt(st.nextToken());
		run(1, new int[4],nums[0]);
		System.out.println(max);
		System.out.println(min);
	}
	
	public static void run(int num,int [] op, int temp) {
		if(num==n) {
			max=Math.max(max, temp);
			min=Math.min(min, temp);
			return;
		}
		for(int i=0;i<4;i++)
			if(op[i]<ops[i]) {
				op[i]+=1;
				switch(i) {
				case 0:run(num+1, op, temp+nums[num]);break;
				case 1:run(num+1, op, temp-nums[num]);break;
				case 2:run(num+1, op, temp*nums[num]);break;
				case 3:run(num+1, op, temp/nums[num]);break;
				}
				op[i]-=1;
			}
	}
}
