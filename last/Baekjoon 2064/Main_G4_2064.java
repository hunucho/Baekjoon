import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		int [] minIP = new int [] {255,255,255,255}, MASK = new int [4], cnt = new int [32];
		
		for(int i=0;i<N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(),".");
			for(int j=0;j<4;j++) {
				int digit=Integer.parseInt(st.nextToken());
				minIP[j]&=digit;				
				for(int k=0;k<8;k++) {
					if(digit%2==1)
						cnt[8*(j+1)-1-k]++;
					digit/=2;
				}
			}
		}

		boolean chk = true;
		for(int i=0;i<4;i++) {
			int tmp=0;
			if(chk) {
			for(int j=7;j>=0;j--)
				if(cnt[i*8+7-j]==N || cnt[i*8+7-j]==0)
					tmp+=Math.pow(2, j);
				else
					chk=false;
			}
			MASK[i]=tmp;
		}
		
		for(int i=0;i<4;i++)
			System.out.print((minIP[i]&MASK[i])+ (i!=3?".":"\n"));
		for(int i=0;i<4;i++)
			System.out.print(MASK[i]+ (i!=3?".":"\n"));
	}
}
