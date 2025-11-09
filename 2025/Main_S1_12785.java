import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int w=Integer.parseInt(st.nextToken()), h=Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int x=Integer.parseInt(st.nextToken()), y=Integer.parseInt(st.nextToken());
        int MOD = 1000007;
        int [][] map = new int [h+1][w+1];
        // 항상 좌표가 왼쪽 밑이 1,1이라면 헷깔린다.
        // H가 맵의 높이, W가 맵의 너비이다.
        map[0][1]=1;
        // 경로 조건에 따라 최소로 이동해서 갈려면 왼쪽에서 오른쪽, 위에서 밑으로 올 수 있는 경로밖에 없다.
        // 집에서 토스트집까지 갈 수 있는 최소 이동 경로를 카운팅한다.
        for(int i=1;i<=y;i++)
            for(int j=1;j<=x;j++)
                map[i][j] = (map[i][j-1]+map[i-1][j])%MOD;
        // 토스트집에서 학교까지 갈 수 있는 최소 경로를 동일한 로직으로 카운팅한다.
        // 원래라면 (y, x)일때는 위에서 계산했기에 제외하면 되지만, 동일한 알고리즘일기에 무시하고 한번 더 계산하는게 쉽다.
        for(int i=y;i<=h;i++)
            for(int j=x;j<=w;j++)
                map[i][j] = (map[i][j-1]+map[i-1][j])%MOD;
        // 학교 위치에서 지나온 최소 경로의 수를 저장하고 있기에 그대로 출력하면 된다.
        System.out.print(map[h][w]);
    }
}