import java.util.*;
import java.io.*;

public class Main_B3_13416 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		for(int t=0;t<T;t++) {
			int n=Integer.parseInt(br.readLine()), ans=0;
			for(int i=0;i<n;i++) {
				int tmp=0;
				StringTokenizer st = new StringTokenizer(br.readLine());
				for(int j=0;j<3;j++)
					tmp=Math.max(tmp,Integer.parseInt(st.nextToken()));
				ans+=tmp;
			}
			System.out.println(ans);
		}
	}
}
