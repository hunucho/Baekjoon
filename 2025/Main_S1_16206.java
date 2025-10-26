import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()), M=Integer.parseInt(st.nextToken()), ans=0;
        ArrayList<Integer> ten = new ArrayList<>(), al = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        // 10의 배수일때가 적게 자르면서 2조각 이상을 만들 수 있음
        for(int i=0;i<N;i++){
            int tmp = Integer.parseInt(st.nextToken());
            // 10인 경우에는 바로 ans에 값을 더해주면 됨
            if(tmp%10==0){
                if(tmp==10)
                    ans++;
                else // 10보다 큰 10의 배수라면 따로 저장
                    ten.add(tmp);
            } else if(tmp>10)
                al.add(tmp);
        }
        // 10의 배수에 대해서는 20일때는 한번만 잘라도 1개가 늘어나기에 우선적으로 자르기 위해서 정령
        // 30의 경우 3조각이 되려면 2번 잘라야함
        Collections.sort(ten);
        for(int i=0;i<ten.size();i++) {
            int num = ten.get(i);
            if (num % 10 == 0) {
                // 자르는 횟수는 10의 몫 - 1이다.
                // 20의 경우 1번 자름
                // 30의 경우 2번 자름
                int tmp = num / 10 - 1;
                // 자른 값이 M보다 작으면 해당 값을 더함
                if (tmp <= M) {
                    M -= tmp;
                    ans += num / 10;
                } else {
                // 만약에 더 크다면 남은 M만큼 값만 더해준다.
                    ans += M;
                    M = 0;
                }
            }
        }
        // 나머지가 0이 아닌 값들에 대해서 자르는 부분
        for(int i=0;i<al.size();i++){
            int a = al.get(i);
            if(a>10 && M>0) {
                int tmp = a / 10;
                if (tmp > M)
                    ans += M;
                else
                    ans += tmp;
                M -= tmp;
            }
        }
        System.out.print(ans);
    }
}