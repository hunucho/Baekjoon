import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        String K=br.readLine();
        int ans=0;
        for(int i=0;i<N;i++)
            ans+=K.charAt(i)=='1'?1:0;
        // ~K는 전체를 반전, 1을 더하면 마지막 자리가 1로 변경
        // 10110 -> 01001 -> 01010
        // 기존의 K와 AND 연산을 하면 마지막 자리만 1로 됨
        // 10110 & 01010 => 00010
        // K - 위의 값을 하면 가장 오른쪽의 1이 0으로 변경됨
        // 10110 - 00010 => 10100
        System.out.print(ans);
    }
}