import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        int [] fibo = new int [N+1], dp = new int [N+1];
        fibo[0]=fibo[1]=1;
        int i=2, min=0;
        while(i<=N){        // N의 최대값은 10000만 이하일것 같지만, 확실하지 않음
            fibo[i] = fibo[i - 1] + fibo[i - 2];    // Fibo 배열 구하기
            if(fibo[i]>N)       // 구해지는 값이 N보다 크면 그만
                break;
            dp[fibo[i]]=fibo[i-1];  // Fibo로 구해지는 값을 넣어준다.
            i++;
        }
        // N이 짝수 값이면 N/2를 해주는게 최소값임.
        // 나머지 값은 증가하면서 사람/치킨시 0.5보다 커지는데, 2일때는 0.5로 가장 작음
        if(N%2==0)
            min = N/2;
        else    // 홀수의 경우 3을 뺴서 2를 구해주고, 나머지는 2로 나눠 최소값으로 계산
            min = 2 + (N-3)/2;
        // 4보다 큰 경우, 모든 수를 계산하며 최대 값을 찾는다
        // 작은 값부터 위로 채워가면 최대의 값을 구할 수 있다.
        for(i=4;i<=N;i++){
            for(int j=i/2;j<=i;j++){
                dp[i] = Math.max(dp[i], dp[i-j]+dp[j]);
            }
        }
        System.out.print(min+" "+dp[N]);
    }
}