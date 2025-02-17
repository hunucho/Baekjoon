import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken()), M=Integer.parseInt(st.nextToken());
        int time = (int) (1440 * ((float)M/N));
        int HH=time/60, MM=time%60;
        System.out.printf("%02d:%02d",HH,MM);

    }
}