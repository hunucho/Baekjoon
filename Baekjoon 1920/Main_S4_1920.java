package silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main_S4_1920 {

	public static boolean bin_search(ArrayList<Integer> arr, int n) {
		int s=0,m=arr.size()/2,e=arr.size()-1;

		while(s<=e) {
			if(arr.get(m)==n)
				return true;
			else if(arr.get(m)<n) {
				s=m+1;
				m=(s+e)/2;
			}
			else if(arr.get(m)>n) {
				e=m-1;
				m=(s+e)/2;
			}
			else
				break;
		}
		return false;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i=0;i<n;i++)
			arr.add(Integer.parseInt(st.nextToken()));
		arr.sort(null);
		int m=Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());

		for(int i=0;i<m;i++) {
			if(bin_search(arr, Integer.parseInt(st.nextToken())))
				bw.write("1\n");
			else
				bw.write("0\n");
		}
		bw.flush();
		bw.close();
	}

}
