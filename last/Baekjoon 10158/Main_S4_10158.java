package silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main_S4_10158 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int w=Integer.parseInt(st.nextToken()), h=Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int p=Integer.parseInt(st.nextToken()), q=Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int t=Integer.parseInt(st.nextToken());
		if(((p+t)/w)%2==0)
			p=(p+t)%w;
		else if(((p+t)/w)%2==1)
			p=w-((p+t)%w);
		
		if(((q+t)/h)%2==0)
			q=(q+t)%h;
		else if(((q+t)/h)%2==1)
			q=h-((q+t)%h);
			
		bw.write(p+" "+q);
		bw.close();
	}
}
