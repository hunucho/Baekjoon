import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [] maxScore = {100, 100, 200, 200, 300, 300, 400, 400, 500};
        StringTokenizer st = new StringTokenizer(br.readLine());
        boolean isHacker = false;
        int sum=0;
        for(int i=0;i<maxScore.length;i++){
            int score = Integer.parseInt(st.nextToken());
            if(score>maxScore[i])
                isHacker=true;
            else
                sum+=score;
        }
        System.out.println(isHacker?"hacker":sum>=100?"draw":"none");
    }
}