package silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main_S4_18258 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		String command="";
		int value=0, findex=-1, eindex=-1;				// 비어있는 queue는 -1로 시작, 두개의 인덱스를 줘 첫위치와, 마지막 위치를 찾는다  
		Integer[] arr = new Integer[10000];
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			command = st.nextToken();
			if(st.hasMoreTokens())			// 명령어로 판단이 아닌 불러들인 라인에서 토큰이 더있으면 값을 불러들임
				value=Integer.parseInt(st.nextToken());
			if(command.equals("push"))		// 문자열을 비교할때는 ==이 아니라 object.equals(비교문자열)을 이용한다.
				arr[++eindex]=value;		// 마지막 위치를 하나씩 뒤로밀면서 값을 저장
			else if(command.equals("pop")) { 
				if(eindex-findex==0)		// 첫위치와 마지막위치가 같은거면 큐는 비어있다는 것
					bw.write("-1\n");
				else
					bw.write(arr[++findex]+"\n");	// queue는 앞부터 출력 이기에 시작인덱스부터 출력시켜준다.
			}
			else if(command.equals("size"))	
				bw.write(String.valueOf(eindex-findex)+"\n");
			else if(command.equals("empty")) {
				if(findex==eindex)
					bw.write("1\n");
				else
					bw.write("0\n");
			}
			else if(command.equals("front")) {
				if(findex<eindex)
					bw.write(arr[findex+1]+"\n");
				else
					bw.write("-1\n");
			}
			else if(command.equals("back")) {
				if(findex<eindex)
					bw.write(arr[eindex]+"\n");
				else
					bw.write("-1\n");
			}
				
		}
		bw.close();
	}

}
