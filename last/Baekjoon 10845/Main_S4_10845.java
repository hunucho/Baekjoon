package silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_S4_10845 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
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
					System.out.println(-1);
				else
					System.out.println(arr[++findex]);	// queue는 앞부터 출력 이기에 시작인덱스부터 출력시켜준다.
			}
			else if(command.equals("size"))	
				System.out.println(eindex-findex);
			else if(command.equals("empty")) {
				if(findex==eindex)
					System.out.println(1);
				else
					System.out.println(0);
			}
			else if(command.equals("front")) {
				if(findex<eindex)
					System.out.println(arr[findex+1]);
				else
					System.out.println(-1);
			}
			else if(command.equals("back")) {
				if(findex<eindex)
					System.out.println(arr[eindex]);
				else
					System.out.println(-1);
			}
				
		}
	}

}
