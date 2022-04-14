package silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main_S3_9461 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t=Integer.parseInt(br.readLine());
		ArrayList<Long> p = new ArrayList<Long>();
		p.add((long) 0);
		StringTokenizer st = new StringTokenizer("1 1 1 2 2 3 4 5 7 9");
		for(int i=1;i<=10;i++)
			p.add(Long.parseLong(st.nextToken()));
		for(int i=10;i<100;i++)
			p.add(p.get(i-4)+p.get(i));
		for(int i=0;i<t;i++) {
			bw.write(p.get(Integer.parseInt(br.readLine()))+"\n");
		}
		bw.close();
	}
}
