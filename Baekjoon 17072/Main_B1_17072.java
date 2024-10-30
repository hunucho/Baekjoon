import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int N=Integer.parseInt(st.nextToken()), M=Integer.parseInt(st.nextToken());
		int [] rgb = {2126, 7152, 722};
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<M;j++) {
				long tmp=0;
				for(int k=0;k<3;k++)
					tmp+=rgb[k]*Integer.parseInt(st.nextToken());
					
				char ch = ' ';
				if(tmp<510000)
					ch='#';
				else if(tmp<1020000)
					ch='o';
				else if(tmp<1530000)
					ch='+';
				else if(tmp<2040000)
					ch='-';
				else
					ch='.';
				sb.append(ch);
			}
			sb.append("\n");
		}
		sb.setLength(sb.length()-1);
		System.out.print(sb.toString());
	}
}
