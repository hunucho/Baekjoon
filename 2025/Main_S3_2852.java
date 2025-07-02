import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int scoreA=0, scoreB=0, ansA=0, ansB=0, last=-1;
        for(int n=0;n<N;n++){
            int team=sc.nextInt();
            String Time=sc.next();
            int t=Integer.parseInt(Time.substring(0, 2))*60+Integer.parseInt(Time.substring(3));

            if(scoreA>scoreB)
                ansA+=t-last;
            else if(scoreA<scoreB)
                ansB+=t-last;

            if(team==1)
                scoreA++;
            else
                scoreB++;

            if(last==-1){
                last=t;
                continue;
            }

            last=t;
        }
        if(scoreA>scoreB)
            ansA+=48*60-last;
        else if(scoreA<scoreB)
            ansB+=48*60-last;
        System.out.printf("%02d:%02d\n",ansA/60, ansA%60);
        System.out.printf("%02d:%02d",ansB/60, ansB%60);
    }
}