package silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_S3_15649 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		Main_S3_15649 m15649 = new Main_S3_15649();

		int n=Integer.parseInt(st.nextToken()), m=Integer.parseInt(st.nextToken());
		boolean[] chk=new boolean[n+1];

		for(int i=1;i<=n;i++) {
			chk[i]=true;
			m15649.f(n, 1, m, chk, i+" ");	
			chk[i]=false;
		}

	}
	// 전체 갯수, 몇개를 선택했는지 깊이, 몇개를 선택 할 것인지, 선택히였는지 체크, 이전 경로를 저장
	public void f(int n, int depth, int m, boolean[] chk,String pr) {
		if(depth==m) {	// 일정 깊이에 도착하면 이전 경로들을 출력
			System.out.println(pr);
		}
		else {
			for(int i=1;i<=n;i++) {
				if(chk[i]==false) {		// 선택이 안됬다면 선택한다고 체크후 다음단계로 내려감
					chk[i]=true;
					f(n, depth+1, m, chk, pr.concat(String.valueOf(i)+" "));
					chk[i]=false;		// 다음단계에서 복귀 했을 경우이므로 선택해제처리
				}
			}
		}
	}

}
