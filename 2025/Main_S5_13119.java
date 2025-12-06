import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int N=Integer.parseInt(st.nextToken()), M=Integer.parseInt(st.nextToken()), X=Integer.parseInt(st.nextToken());
        int [] height = new int [M];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<M;i++)
            height[i]=Integer.parseInt(st.nextToken());
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                // 조건이 복잡한것부터 출력
                // 높이 = N-i
                if(N-i==X && N-i<=height[j])    // 높이가 X이면서 높이가 산보다 낮다면 터널
                    sb.append("*");
                else if(N-i==X)                 // 높이가 X이면 다리
                    sb.append("-");
                else if(N-i<=height[j])         // 앞에서 다리와 터널인 경우는 해결했으므로, 높이보다 낮다면 산
                    sb.append("#");
                else if(j%3==2 && N-i<X)        // 높이가 X보다 낮으면서 j가 3의 배수인경우는 교각
                    sb.append("|");
                else                            // 나머지는 모두 .으로 표현
                    sb.append(".");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}