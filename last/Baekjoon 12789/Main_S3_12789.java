import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt(), cnt=1;
		int [] arr = new int [N];
		Stack<Integer> st = new Stack<>();
		for(int i=0;i<N;i++) 
			arr[i]=sc.nextInt();
		for(int i=0;i<N;i++) {
			if(arr[i]==cnt)
				cnt++;
			else if(!st.empty() && st.peek()==cnt) {
				cnt++;
				i--;
				st.pop();
			} else
				st.add(arr[i]);
		}
		
		while(!st.empty()) {
			if(cnt==st.peek()) {
				cnt++;
				st.pop();
			} else
				break;
		}
		System.out.println(st.empty()?"Nice":"Sad");
	}
}
