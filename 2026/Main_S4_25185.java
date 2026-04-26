import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int t=0;t<T;t++){
            int [][] arr = new int [4][11];
            StringTokenizer st = new StringTokenizer(br.readLine());
            boolean ans = false;
            for(int i=0;i<4;i++){
                String card = st.nextToken();
                int symbol=0, number;
                switch (card.charAt(1)){
                    case 'm' : symbol=0; break;
                    case 'p' : symbol=1; break;
                    case 's' : symbol=2; break;
                }
                number = card.charAt(0)-'0';
                arr[symbol][number]++;
            }
            int con3=0;
            for(int i=0;i<3;i++) {
                for (int j = 1; j < 10; j++) {
                    if (arr[i][j] >= 3)
                        ans = true;
                    if (arr[i][j] == 2)
                        con3++;
                    if(arr[i][j-1]>=1 && arr[i][j]>=1 && arr[i][j+1]>=1)
                        ans=true;
                }
            }

            if(con3==2)
                ans=true;
            System.out.println(ans?":)":":(");
        }
    }
}