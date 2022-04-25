package silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main_S4_1755 {
	public static void main(String[] args) throws Exception{
		// 입력 설정
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 숫자를 문자열로 변환하기 위한 배열 생성
		String [] num = new String [] {"zero", "one","two","three","four","five","six","seven","eight","nine"};
		
		// 값 입력
		int m = Integer.parseInt(st.nextToken()), n = Integer.parseInt(st.nextToken()), cnt=0;
		
		// str : M~N까지 숫자가 영어로 바귀어 저장되는 공간, out : 영어가 숫자로 바뀌어 저장되는 공간
		String [] str = new String [n-m+1];
		int [] out = new int [n-m+1];
		// hm : 문자와 숫자를 Map으로 만들어 값을 들고오기 위함
		HashMap<String, Integer> hm = new HashMap<>();
		
		// 문자에 대한 숫자의 값을 매칭시킴
		for(int i=0;i<10;i++)
			hm.put(num[i], i);
		
		// M~N까지 반복하면서 사전순 정렬를 하기위한 밑 작업
		for(int i=m;i<=n;i++) {
			// 숫자가 10보다 클떄와 10 보다 작을떄로 나누어서 1자리, 2자리 숫자를 처리
			if(i<10)
				str[cnt++]=num[i];
			else
				str[cnt++]=num[i/10]+" "+num[i%10];
		}
		Arrays.sort(str);
		
		// 나눠진 숫자를 이용 StringTokenizer를 이용하여 하나의 숫자씩 확인
		for(int i=0;i<cnt;i++) {
			st = new StringTokenizer(str[i]);
			// 1의 자리를 먼저 숫자로 반환
			out[i]=hm.get(st.nextToken());
			// 안에 토큰이 남아 있다면 2자리 값이기에 먼저 반환된 값에서 10을 곱해서 10의 자리고 만들고 1의자리로 추가
			if(st.hasMoreTokens())
				out[i]=out[i]*10+hm.get(st.nextToken());
		}
		
		// 출력
		for(int i=0;i<cnt;i++) {
			bw.write(out[i]+" ");
			// 한줄에 10개씩 출력하기 위함
			if(i%10==9)
				bw.write("\n");
		}
		bw.close();
	}
}