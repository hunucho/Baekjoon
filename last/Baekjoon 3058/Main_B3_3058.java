import java.util.*;
import java.io.*;

public class Main_B3_3058 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		for(int t=0;t<T;t++) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			int min=999, sum=0;
			for(int i=0;i<7;i++) {
				int tmp=Integer.parseInt(st.nextToken());
				if(tmp%2==0) {
					sum+=tmp;
					if(min>tmp)
						min=tmp;
				}								
			}
			System.out.println(sum+" "+min);
		}
	}
}
