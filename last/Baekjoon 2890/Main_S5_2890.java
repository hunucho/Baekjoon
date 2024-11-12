import java.io.*;
import java.util.*;

public class Main_S5_2890 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int r=Integer.parseInt(st.nextToken()), c=Integer.parseInt(st.nextToken()), cnt=1;
		String [] map = new String [r];
		int [] order = new int [9];
		for(int i=0;i<r;i++)
			map[i]=br.readLine();
		for(int j=c-1;j>=0;j--) {
			boolean chk=false;
			for(int i=0;i<r;i++) {
				char ch=map[i].charAt(j);
				if(ch>='1' && ch<='9' && order[ch-'1']==0) {
					order[ch-'1']=cnt;
					chk=true;
				}
			}
			if(chk)
				cnt++;
		}
		for(int i=0;i<9;i++)
			System.out.println(order[i]);
	}
}
