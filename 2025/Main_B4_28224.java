import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception{
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int ans=0;
        for(int i=0;i<N;i++)
            ans+=sc.nextInt();
        System.out.print(ans);
    }
}