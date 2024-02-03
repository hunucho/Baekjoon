import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long sum=0, ans=0;
        int [] arr = new int [N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            sum+=arr[i];
        }
        for(int i=0;i<N-1;i++){
            sum-=arr[i];
            ans+=arr[i]*sum;
        }
        System.out.println(ans);
    }
}
/*
5
1 2 3 4 5 가 있을 경우
1*2 + 1*3 + 1*4 + 1*5 +
2*3 + 3*4 + 3*5 +
3*4 + 3*5 +
4*5 를 계산한다

이것은 1(2+3+4+5) +
2(3+4+5) +
3(4+5) +
4(5)로 표현 할 수 있다

입력되는 모든 값을 더한 다음 arr[i]를 빼고 남은 sum과 arr[i] * sum을 구해 ans에 더하면 정답을 구할 수 있다.

 */