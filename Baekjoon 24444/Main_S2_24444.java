import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken()), R = Integer.parseInt(st.nextToken());
        ArrayList<Integer>[] arr = new ArrayList[N + 1];
        boolean[] chk = new boolean[N + 1];
        int[] ans = new int[N + 1];
        int cnt = 1;
        for (int i = 0; i <= N; i++)
            arr[i] = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken()), to = Integer.parseInt(st.nextToken());
            arr[from].add(to);
            arr[to].add(from);
        }
        for (int i = 1; i <= N; i++)
            Collections.sort(arr[i]);
        Queue<Integer> q = new LinkedList<>();
        q.add(R);
        chk[R] = true;
        ans[R] = cnt++;
        while (q.size() > 0) {
            int x = q.poll();
            for (int i = 0; i < arr[x].size(); i++) {
                int tmp = arr[x].get(i);
                if (!chk[tmp]) {
                    chk[tmp] = true;
                    ans[tmp] = cnt++;
                    q.add(tmp);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            sb.append(ans[i] + "\n");
        }
        System.out.println(sb.toString());
    }
}

// '무'방향 그래프
// 인접 정점을 오름차순으로 정렬