import java.util.*;
import java.io.*;

class Main {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A=Integer.parseInt(st.nextToken()), B=Integer.parseInt(st.nextToken());
        char ans='<';
        if (A == 3 || A == 4)
            A = 1;
        if (B == 3 || B == 4)
            B = 1;
        if (A == B)
            ans = '=';
        else if (A == 1)
            ans = '<';
        else if (B == 1 || (A == 0 && B == 2) || (A == 2 && B == 5) || (A == 5 && B == 0))
            ans = '>';
        System.out.print(ans);
    }
}