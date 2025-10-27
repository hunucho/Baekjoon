import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        long ans=0;
        // 약수를 찾아서 접근하면 O(N*sqrt(N))이 된다
        // g(x)에서 O(N), 약수를 구하는 부분에서 O(sqrt(N))
        // 배수를 이용해서 찾으면 됨
        // f(1)부터 f(12)까지 적어보면 1은 계속 나오고
        // 2는 2의 배수에만, 3은 3의 배수에만 나오는 것을 확인
        for(int i=1;i<=N;i++)
            ans+=i * (N/i);
        System.out.print(ans);
    }
}