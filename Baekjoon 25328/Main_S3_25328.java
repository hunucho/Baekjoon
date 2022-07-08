package silver;

import java.io.*;
import java.util.*;

public class Main_S3_25328 {
	static HashSet<String> hs = new HashSet<String>(), dup=new HashSet<String>();
	static int k;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String [] x=new String[3];
		int i=0;
		for(i=0;i<3;i++)
			x[i]=br.readLine();
		k=Integer.parseInt(br.readLine());
		for(i=0;i<3;i++)
			make(x[i],new char[k],0,0);	// char의 최대 길이는 k와 동일하기에 k사이즈릐 char 배열을 할당
		if(dup.size()==0)	// 중복되는 문자열이 없으면 -1을 출력
			bw.write("-1");
		else {
			Iterator<String> iter = dup.iterator();	// dup Set의 내용들을 Iterator를 이용하여 출력
			String [] ans = new String [dup.size()];	// ans를 dup size만큼 할당후 
			i=0;
			while(iter.hasNext())	// 모든 내용들을 ans에 전달
				ans[i++]=iter.next();
			Arrays.sort(ans);	// 오름차순으로 출력하기 위한 정렬을 함
			for(i=0;i<dup.size();i++)	// 답안 출력
				bw.write(ans[i]+"\n");
		}
		bw.close();
	}
	
	public static void make(String str,char [] nstr, int s, int depth) {
		if(depth==k) {	// k 길이만큼의 문자열이 생성되었다면 
			if(hs.contains(String.valueOf(nstr)))	// 이미 출현한 hs Set안에 있다면 duplication Set에 추가한다
				dup.add(String.valueOf(nstr));
			else	// 처음 등장하는 배열이라면 hs set에 저장
				hs.add(String.valueOf(nstr));
			return;
		}
		for(int i=s;i<str.length();i++) {	// 순열을 이용하여 모든 경우의 수가 가능한 문자열을 생성한다
			nstr[depth]=str.charAt(i);
			make(str,nstr,i+1, depth+1);
		}
	}
}
