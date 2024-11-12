package silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main_S4_10866 {
		
	public static boolean chk(ArrayList<Integer> arr) {
		if(arr.size()==0)
			return false;
		return true;
	}
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		String command="";
		int value=0;  
		ArrayList<Integer> arr = new ArrayList<>();
		
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			command = st.nextToken();
			if(st.hasMoreTokens())			// 명령어로 판단이 아닌 불러들인 라인에서 토큰이 더있으면 값을 불러들임
				value=Integer.parseInt(st.nextToken());
			if(command.equals("push_front"))		// 문자열을 비교할때는 ==이 아니라 object.equals(비교문자열)을 이용한다.
				arr.add(0, value);
			else if(command.equals("push_back"))
				arr.add(arr.size(), value);
			else if(command.equals("pop_front"))
			{
				if(chk(arr)) {
					System.out.println(arr.get(0));
					arr.remove(0);
				}
				else
					System.out.println(-1);
			}
			else if(command.equals("pop_back"))
			{
				if(chk(arr)) {
					System.out.println(arr.get(arr.size()-1));
					arr.remove(arr.size()-1);
				}
				else
					System.out.println(-1);
			}	
			else if(command.equals("size")) {
				//System.out.println("size");
				System.out.println(arr.size());
			}
			else if(command.equals("empty")) {
				if(arr.isEmpty())
					System.out.println(1);
				else
					System.out.println(0);
			}
			else if(command.equals("front")) {
				if(chk(arr))
					System.out.println(arr.get(0));
				else
					System.out.println(-1);
			}
			else if(command.equals("back")) {
				if(chk(arr))
					System.out.println(arr.get(arr.size()-1));
				else
					System.out.println(-1);
			}
				
		}
	}

}
