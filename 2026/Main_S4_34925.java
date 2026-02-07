import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long H = Long.parseLong(st.nextToken()), cur = H, S = Long.parseLong(st.nextToken());
        long ans = 1;
        if(H<=2){   // H가 2보다 작으면 즉사
            ans=1;
        } else if(H<=4){    // 4보다 작으면 1대 맞으면 바로 회복해야함
            // S만큼 더 방어 가능, 0이하가 될때까지 2대는 맞을 수 있음
            ans=2+S;
        } else {
            // S마다 3을 회복하는것은 문제에 나와있음.
            // 피격당할 수 있는 횟수는 -1일때도 횟수로 카운팅 되므로 +1을 해준다.
            // S가 0인 상황에서 H가 5라면 3대 피격가능, 6이라면 3대 피격가능
            // H가 7일때 4대 피격가능, 8일때 4대 피격가능
            ans = (3*S+H+1)/2;
        }
        System.out.print(ans);
    }
}