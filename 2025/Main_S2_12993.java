import java.util.*;
import java.io.*;

public class Main {
    static int posx, posy;
    public static boolean f(long x, long y, int k){
        int move = (int)Math.pow(3, k);
        if(x==posx && y==posy)
            return true;
        if(x>posx || y>posy)
            return false;
        if(posx>=x+move && f(x+move, y, k+1))
            return true;
        if(posy>=y+move && f(x, y+move, k+1))
            return true;
        return false;
    }
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        posx=Integer.parseInt(st.nextToken());
        posy=Integer.parseInt(st.nextToken());

        System.out.println(f(0, 0, 0)?1:0);
    }
}