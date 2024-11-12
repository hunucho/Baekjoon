import java.io.*;
import java.util.*;

class Main {
	static HashMap<String, String> hm;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        hm = new HashMap<>();
        for(int i=0;i<N;i++)
        	putHash(br.readLine());
        int M=Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<M;i++)
        	sb.append(getHash(st.nextToken())).append(" ");
        System.out.println(sb.toString());
	}
	
	public static void putHash(String S) {
		if(S.length()<=2)
			hm.put(S, S);
		else {
			char [] tmp = S.substring(1, S.length()-1).toCharArray();
			Arrays.sort(tmp);
			String s = S.charAt(0) + String.valueOf(tmp) + S.charAt(S.length()-1);
			hm.put(s, S);
		}
	}

	public static String getHash(String S) {
		if(S.length()<=2)
			return hm.get(S);
		
		char [] tmp = S.substring(1, S.length()-1).toCharArray();
		Arrays.sort(tmp);
		String s = S.charAt(0) + String.valueOf(tmp) + S.charAt(S.length()-1);
	
		return hm.get(s);
	}
}

