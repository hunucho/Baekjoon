package silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main_S3_16967 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int h=Integer.parseInt(st.nextToken()),w=Integer.parseInt(st.nextToken()), x=Integer.parseInt(st.nextToken()), y=Integer.parseInt(st.nextToken());
		int [][] a = new int[h+x][w+y], b=new int[h+x][w+y];
		
		for(int i=0;i<h+x;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<w+y;j++)
				b[i][j] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=0;i<x;i++) {
			for(int j=0;j<w;j++)
				a[i][j]=b[i][j];
		}
		
		for(int j=0;j<y;j++) {
			for(int i=0;i<h;i++)
				a[i][j]=b[i][j];
		}
		
		for(int i=x;i<h;i++) {
			for(int j=y;j<w;j++) {
				a[i][j]=b[i][j]-a[i-x][j-y];
			}
		}
		
		for(int i=0;i<h;i++) {
			for(int j=0;j<w;j++)
				bw.write(a[i][j]+" ");
			bw.write("\n");
		}
		bw.close();
	}
	
}
