import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt(), M=sc.nextInt();
        int sx=sc.nextInt(), sy=sc.nextInt();
        int ex=sc.nextInt(), ey=sc.nextInt();
        String ans = "NO";
        if((N==1 || M==1) && !(sx==ex && sy==ey))
            ans = "NO";
        else if((sx+sy)%2 == (ex+ey)%2)
            ans="YES";
        System.out.print(ans);
    }
}