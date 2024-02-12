import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A=sc.nextInt(), B=sc.nextInt(), N=sc.nextInt();
        int res=A%B, ans=0;
        for(int i=0;i<N;i++){
            res*=10;
            ans=res/B;
            res=res%B;
        }
        System.out.println(ans);
    }
}

//= 3.57142857142857