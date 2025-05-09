import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        String ans = sc.next();
        int N=sc.nextInt();
        for(int i=0;i<6;i++){
            String tmp = sc.next();
            int cnt=sc.nextInt();
            if(N<cnt){
                ans=tmp;
                N=cnt;
            }
        }
        System.out.println(ans);
    }
}