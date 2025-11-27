import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        // 1. 바로 맞는 경우
        // 2. 채널 변경만 하면 맞는 경우
        // 3. 현재 채널에서 업다운 버튼 사용
        // 4. 다른 채널에서 업다운 버튼 사용
        // 5. 숫자버튼 누르기
        for(int t=0;t<T;t++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int ans = 6;        // Case 5. 모든 경우에서 6번을 누르면 버튼으로 바로 호출가능
            int [] freq = new int [2];      // 소숫점을 가진 값을 더하면 오차가 생기기에 정수화 시켜서 계산
            freq[0] = Integer.parseInt(st.nextToken().replaceAll("\\.",""));
            freq[1] = Integer.parseInt(st.nextToken().replaceAll("\\.",""));
            int ch = st.nextToken().charAt(0)=='A'?0:1;
            int target = Integer.parseInt(st.nextToken().replaceAll("\\.",""));
            // 주어지는 값들인 144.000에서 .을 빈칸으로 대체후 Int형으로 변환

            if(freq[ch]==target)    // Case 1. 바로 맞는 경우
                ans=0;
            else if (freq[1-ch]==target)    // Case 2. 채널만 변경하면 되는 경우
                ans=1;
            else{
                int tmpU = freq[ch], tmpD = freq[ch];
                for(int i=1;i<=6;i++) {     // Case 3. 현재 선택된 채널에서 UP, DOWN 버튼으로 조작
                    tmpU=getAdd(tmpU,20);
                    tmpD=getAdd(tmpD,-20);
                    if(tmpU==target || tmpD==target)
                        ans=Math.min(ans, i);
                }
                tmpU = freq[1-ch];
                tmpD = freq[1-ch];
                for(int i=1;i<=5;i++) {     // Case 4. 다른 채널에서 UP, DOWN 버튼으로 조작
                    tmpU=getAdd(tmpU,20);
                    tmpD=getAdd(tmpD,-20);
                    if(tmpU==target || tmpD==target)
                        ans=Math.min(ans, i+1); // 채널 변경시 A/B 버튼을 한번 눌려야 하니까 +1을 해줌
                }
            }
            sb.append(ans).append("\n");
        }
        System.out.println(sb);
    }

    static int getAdd(int A, int B){
        if(A+B > 146000)        // 더해지는 값이 146.000보다 크면 반대쪽 끝 경계로 강제 설정
            return 144000;
        else if(A+B < 144000)
            return 146000;
        else
            return A+B;
    }
}
