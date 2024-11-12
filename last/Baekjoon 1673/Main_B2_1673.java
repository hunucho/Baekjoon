import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt(), k=sc.nextInt(),ans=n;
            while(n>=k) {
                int tmp=n/k;    // 쿠폰으로 먹은 치킨 개수
                ans+=tmp;       // 최종답에 더함
                n+=n/k;         // 치킨을 먹었으니까 치킨 개수 추가
                n-=tmp*k;       // 사용한 쿠폰 개수를 차감
            }
            System.out.println(ans);
        }
    }
}