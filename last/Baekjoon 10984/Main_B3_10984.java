package bronze;

import java.io.*;
import java.util.*;

public class Main_B3_10984 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int t=0;t<T;t++) {
			int n=Integer.parseInt(br.readLine());
			int sum=0, temp;
			double gpa=0;
			for(int i=0;i<n;i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				temp=Integer.parseInt(st.nextToken());
				sum+=temp;
				gpa+=Double.parseDouble(st.nextToken())*temp;
			}
			System.out.println(sum+" "+Math.round(gpa/sum*10)/10.0);
		}
	}
}
