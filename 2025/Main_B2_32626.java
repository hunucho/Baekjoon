import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int [] X = new int [3], Y = new int [3];
        for(int i=0;i<3;i++) {
            X[i] = sc.nextInt();
            Y[i] = sc.nextInt();
        }
        int ans=1;
        if(X[0]==X[1]){
            ans=(X[1]==X[2] && ((Y[0]<Y[2] && Y[2]<Y[1]) || (Y[1]<Y[2] && Y[2]<Y[0])))?2:0;
        } else if(Y[0]==Y[1]){
            ans=(Y[1]==Y[2] && ((X[0]<X[2] && X[2]<X[1]) || (X[1]<X[2] && X[2]<X[0])))?2:0;
        }
        System.out.print(ans);
    }
}