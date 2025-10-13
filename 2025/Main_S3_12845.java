import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine()), max=0, ans=0;
        int [] L = new int [N];
        StringTokenizer st= new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++) {
            L[i] = Integer.parseInt(st.nextToken());
            ans+=L[i];
            max = Math.max(max, L[i]);  // 가장 큰 값에 다른 값들을 합성하는게 가장 큰 값을 만들 수 있다.
        }
        // 1개이면 입력된 값만 리턴
        // 2개이면 입력된 값을 리턴하면 인접한 상태와 동일한 결과를 만듬
        // 3개 이상이면 자신과 인접한 하나의 값을 제외하고, 최대값과 합성하는 형태로 max값을 더해준다.
        if(N>2)
            ans+=max*(N-2);
        System.out.print(ans);
    }
}