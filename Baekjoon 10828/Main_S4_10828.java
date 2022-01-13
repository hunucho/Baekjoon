package silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_S4_10828 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken());
		int[] arr=new int[10000];
		int top=-1;
		int value=0;
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			String command = st.nextToken();
			
			if(st.hasMoreTokens())			// 입력값이 하나 더있다면 그 값은 숫자 변수임
				value = Integer.parseInt(st.nextToken());
			
			if(command.equals("push"))		// 값을 스택에 넣는다
				arr[++top]=value;
			else if(command.equals("pop")){	// 값 출력시
				if(top==-1)
					System.out.println(-1);
				else
					System.out.println(arr[top--]);	// 상단에 있는것을 출력하고 top 인덱스를 1 감소시킨다.
			}
			else if(command.equals("size"))		// top이 -1부터 시작했기에
				System.out.println(top+1);		// 1을 추가해서 갯수를 출력해준다. -> 1개가 있으면 top은 0이기에 1을 추가해야지 1이라 출력됨
			else if(command.equals("empty")) {
				if(top==-1)
					System.out.println(1);
				else
					System.out.println(0);
			}
			else if(command.equals("top")){
				if(top==-1)
					System.out.println(-1);
				else
					System.out.println(arr[top]);
			}
		}
	}
}
