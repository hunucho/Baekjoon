import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int SY=sc.nextInt(), SM=sc.nextInt(), SD=sc.nextInt();
        int EY=sc.nextInt(), EM=sc.nextInt(), ED=sc.nextInt();
        int Sday=SY*360+SM*30+SD, Eday = EY*360+EM*30+ED, diff=Eday-Sday;
        int ansM=Math.min(diff/30, 36), ansY=0, A=-1;
        for(int i=0;i<diff/360;i++){
            if(i%2==0)
                A++;
            ansY+=15+A;
        }
        System.out.println(ansY+" "+ansM);
        System.out.println(diff+"days");
    }
}