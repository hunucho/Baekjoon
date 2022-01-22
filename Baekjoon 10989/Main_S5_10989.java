package silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_S5_10989 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine());
		int[] arr=new int[10001];
		for(int i=0;i<n;i++) {
			arr[Integer.parseInt(br.readLine())]++;
		}
		for(int i=0;i<10001;i++)
			if(arr[i]!=0) {
				for(int j=0;j<arr[i];j++)
					bw.write(i+"\n");
			}
		bw.close();
	}

}
