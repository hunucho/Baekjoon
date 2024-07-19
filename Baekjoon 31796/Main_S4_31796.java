import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int [] price = new int [N];
		for(int i=0;i<N;i++)
			price[i]=Integer.parseInt(st.nextToken());
		Arrays.sort(price);
		int ans=0, last = 1;
		for(int i=0;i<N;i++) {
			if(last*2<=price[i]) {
				last=price[i];
				ans++;
			}
		}
		System.out.println(ans);
	}
}
