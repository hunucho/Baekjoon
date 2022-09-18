package silver;

import java.util.*;
import java.io.*;

public class Main_S1_16139 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s=br.readLine();
		int q=Integer.parseInt(br.readLine());
		int [][] ch = new int[s.length()+1][26];	// 뒤에 입력받는 부분은 그 전까지의 값을 포함하기에 밑값을 포함하기 위해 행을 하나 더 가져간다 
		for(int i=0;i<s.length();i++) {	// 문자열을 순차적으로 검사하면서 누적합을 생성
			char tmp = s.charAt(i);
			ch[i+1][tmp-'a']++;
			for(int j=0;j<26;j++)	// 알파벳을 하나씩 검사하며 이전에 존재하는 값을 뒤로 민다
				ch[i+1][j]+=ch[i][j];	
		}
		for(int i=0;i<q;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			char a=st.nextToken().charAt(0);
			int l=Integer.parseInt(st.nextToken()), r=Integer.parseInt(st.nextToken());
			bw.write(ch[r+1][a-'a']-ch[l][a-'a']+"\n");
			// 누적합 배열을 하나 더 만들었기에 출력하는 부분은 하나씩 더 밀어서 출력이 된다.
			// 예제 a 6 10의 경우 현 프로그램에서의 a의 배열값은 7에서 1 11에서 2가 되게 만들어져있다.
			// 저장하는 위치를 1씩 추가했기에 출력할때는 배열이 1로 시작한다고 생각하고 계산
		}
		bw.close();
	}
}
