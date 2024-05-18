import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt(), ans=0;
        for(int i=0;i<N;i++)
            ans= Math.max(ans, sc.nextInt());
        System.out.println(ans);
    }
}