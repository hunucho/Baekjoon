import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception{
        Scanner sc =new Scanner(System.in);
        int N=sc.nextInt();
        int ans=(N-1)*8;
        for(int i=0;i<N;i++)
            ans+=sc.nextInt();
        System.out.println(ans/24+" "+ans%24);
    }
}