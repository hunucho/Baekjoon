package silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main_S4_17219 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		HashMap<String, String> saved = new HashMap<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken()), m=Integer.parseInt(st.nextToken());
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			String id = st.nextToken(), pw = st.nextToken();
			saved.put(id, pw);
		}
		for(int i=0;i<m;i++) {
			String id=br.readLine();
			bw.write(saved.get(id)+"\n");
		}
		bw.close();		
	}
}