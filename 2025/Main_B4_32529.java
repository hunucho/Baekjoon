import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int [] price = new int [3], weight = new int [3];
        for(int i = 0; i < 3; i++)
            price[i]=Integer.parseInt(st.nextToken());
        price[1]*=2;
        price[2]*=5;
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < 3; i++)
            weight[i]=Integer.parseInt(st.nextToken());
        int ans=0;
        for(int i=0;i<3;i++)
            ans+=price[i]*weight[i]/100;
        System.out.print(ans);
    }
}
