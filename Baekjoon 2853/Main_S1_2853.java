import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(),":");
		int N=Integer.parseInt(st.nextToken()), ans=0;
		int [] days = new int [N];
		for(int i=0;i<N;i++)
			days[i] = Integer.parseInt(br.readLine());
		for(int i=1;i<N;i++) {
			if(days[i]==0)
				continue;
			int d=days[i]-days[0];
			boolean newBoat = false;
			for(int j=1;j<N;j++) {
				if(days[j]==0)
					continue;
				if(days[j]%d==1) {
					newBoat = true;
					days[j]=0;
				}					
			}
			if(newBoat)
				ans++;
		}
		System.out.println(ans);		
	}
}
