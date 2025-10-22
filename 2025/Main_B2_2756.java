import java.util.*;
import java.io.*;

class Main {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());
        for(int t=0;t<T;t++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A=0, B=0;
            for (int i = 0; i < 3; i++)
                A+=getScore(Double.parseDouble(st.nextToken()), Double.parseDouble(st.nextToken()));
            for (int i = 0; i < 3; i++)
                B+=getScore(Double.parseDouble(st.nextToken()), Double.parseDouble(st.nextToken()));
            System.out.printf("SCORE: %d to %d, %s.\n",A, B, A>B?"PLAYER 1 WINS":A<B?"PLAYER 2 WINS":"TIE");
        }
    }

    static int getScore(double x, double y){
        int [] dist = {3, 6, 9, 12, 15};
        int [] score = {100, 80, 60, 40, 20};
        for(int i=0;i<5;i++)
            if(x*x+y*y<=dist[i]*dist[i])
                return score[i];
        return 0;
    }
}