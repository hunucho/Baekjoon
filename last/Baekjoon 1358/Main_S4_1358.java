import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc =new Scanner(System.in);
        int W=sc.nextInt(), H=sc.nextInt(), X=sc.nextInt(), Y=sc.nextInt(), P=sc.nextInt();
        double R=H/2;
        int ans=0;
        for(int i=0;i<P;i++){
            double x = sc.nextDouble(), y=sc.nextDouble();
            boolean tmp=false;
            if(X<=x && x<=X+W && Y<=y && y<=Y+H)
                tmp=true;
            else if(Math.pow(x - X,2) + Math.pow(y-(Y+R),2)<=Math.pow(R,2))
                tmp=true;
            else if(Math.pow(x - (X+W),2) + Math.pow(y-(Y+R),2)<=Math.pow(R,2))
                tmp=true;
            if(tmp)
                ans++;
        }
        System.out.println(ans);
    }
}