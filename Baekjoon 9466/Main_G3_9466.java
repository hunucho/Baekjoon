package gold;

import java.io.*;
import java.util.*;

public class Main_G3_9466 {
	static int [] students;
	static int n;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T=Integer.parseInt(br.readLine());
		for(int t=0;t<T;t++) {
			n=Integer.parseInt(br.readLine());
			students = new int [n+1];
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			for(int i=1;i<=n;i++)
				students[i]=Integer.parseInt(st.nextToken());

			System.out.println(find());
		}
	}

	static int find(){
        int[] links = new int[n+1];
        int ans = n;

        for (int i = 1; i <= n; i++) {
            int current = i;
            while (links[current] == 0){	// 탐색하지 않았다면 방문 가능한 상태
                links[current] = i + 1;	// 현재 깊이에서 탐색했다는 것을 i+1 값을 주어서 체크
                current = students[current];	// 연쇄적으로 값을 이어나감
            }	// -> 사이클이 생기기 전까지 계속해서 확인

            if (links[current] == i + 1){	// 현재 깊이에서 탐색한 단계라면 체크
                int start = current;	// 위에 while문에서 반복을 이용하여 사이클을 찾았기에, 마지막 위치는 current임
                ans--;	// a->a로 가는 경우 하단의 while을 반복을 안하기에, ans--
                while ((current = students[current]) != start)	// 마지막으로 방문한 위치에서 전체를 찾아나가면서 한번의 사이클이 될때까지 탐색하여 조가 형성된 팀원수를 출력
                    ans--;
            }
        }
        return ans;
    }
	
//	static int [] students, chk;
//	public static void main(String[] args) throws Exception{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		int T=Integer.parseInt(br.readLine());
//		for(int t=0;t<T;t++) {
//			int n=Integer.parseInt(br.readLine()), ans=0;
//			students = new int [n+1];
//			chk = new int [n+1];
//			StringTokenizer st = new StringTokenizer(br.readLine());
//			
//			for(int i=1;i<=n;i++) {
//				students[i]=Integer.parseInt(st.nextToken());
//				if(students[i]==i)	// 혼자서만 하는 사람은 바로 체크해준다.
//					chk[i]=1;
//			}
//			// chk값 정보
//			// -1 : 팀구성 불가능, 0 : 탐색 X 혹은 탐색했찌만 다른 팀구성이 가능한경우 초기화, 1 : 팀구성 완료 
//			for(int i=1;i<=n;i++) {	// 처음 사람부터 탐색을 하면서 팀 구성 가능한 방법을 찾음
//				if(chk[i]==0)
//					if(dfs(i, i, students[i], new HashSet<Integer>())==0)	// 팀구성을 했을때 return이 0이면 만들어진 경로안에서 시작점이 다르면 구성할 수 있는 팀이 있음
//						chk[i]=-1;	// 시작하는 점만 구성못하는 것으로 체크
//			}
//			
//			for(int i=1;i<=n;i++)
//				if(chk[i]==-1)
//					ans++;
//			bw.write(ans+"\n");
//		}
//		bw.close();
//	}
//	
//	static int dfs(int start,int cur, int next, HashSet<Integer> hs) {
//		if(start==next)	// 시작점과 다음으로 보는 점이 동일한 경우, 하나의 사이클이 형성된 것
//			return chk[cur]=1;	// 현재점을 팀 구성 가능으로 적고, 모든 경로에 적용
//		if(chk[cur]==0) {	// 방문 하지 않았을 경우
//			chk[cur]=2;	// 방문 체크
//			hs.add(cur);	// 구성되는 사이클의 변수값들을 저장
//			chk[cur]=dfs(start, next, students[next], hs);
//			return chk[cur];
//		}
//		else {
//			if(hs.contains(next))	// 구성된 경로에 갈 수 있는 경로가 있다면 시작점을 바꾼다면 다른 학생으로 부터 시작하는 팀구성 가능
//				return 0;
//			else
//				return -1;	// 구성할 수 있는 팀이 없기에 전체를 구성 불가능으로 체크
//		}
//	}
}
