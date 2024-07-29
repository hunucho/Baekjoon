import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        for(int i=0;i<N;i++){
            int x=sc.nextInt();
            for(int j=10;j<=x;j*=10){
                if(x%j>=j/2) {
                    x += j;
                    x-=x%j;
                } else
                    x-=x%j;
            }
            System.out.println(x);
        }
    }
}