import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 주어진 조건대로 식을 만들어내면 N^2 * An+1 = A1+...+An 이 된다
        // A1을 N^2로 나누면 0혹은 1이상이 되야하므로 A1을 N^2으로 생각할 수 있다.
        int N=Integer.parseInt(br.readLine()), A = N*N;
        StringBuilder sb = new StringBuilder();
        long sum = A;
        sb.append(A).append(" ");
        A-=N;
        if(N%2==1) // N이 홀수개가 나온다면 9 6 3 의 경우 평균은 6이되기에 An != An+1 의 조건이 만족하지 않는다.
            A-=N; // A2의 값을 무시한다면 9 3 0을 볼 수 있기에 하나를 무시한다.
        for(int i=A;N%2==1?i>=0:i>0;i-=N){  // N이 홀수일경우와 짝수일 경우로 나눠 조건을 만들어준다.
            sb.append(i).append(" ");
            sum+=i; // A의 값들을 저장
        }
        sb.append(sum/N);   // 마지막에 N으로 나눠서 출력
        System.out.print(sb);
    }
}