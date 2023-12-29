import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String input = "", line="";
		while((input=br.readLine())!=null) {
			StringTokenizer st = new StringTokenizer(input);
//			if(input.compareTo("end")==0)
//				break;
			while(st.hasMoreTokens()) {
				String tmp = st.nextToken();
				if(tmp.compareTo("<br>")==0) {
					sb.append(line+"\n");
					line="";
				} else if(tmp.compareTo("<hr>")==0) {
					if(line.length()==0)
						sb.append("--------------------------------------------------------------------------------\n");
					else
						sb.append(line+"\n--------------------------------------------------------------------------------\n");
					line="";
				} else if(line.length()+1+tmp.length()>80) {
					sb.append(line+"\n");
					line=tmp;
				} else {
					if(line.length()>0)
						line=line+" "+tmp;
					else
						line = tmp;
				}
			}
		}
		if(line.length()>0)
			sb.append(line);
		System.out.println(sb.toString());
	}
}
