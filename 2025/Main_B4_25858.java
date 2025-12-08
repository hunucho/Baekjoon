import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()), d = Integer.parseInt(st.nextToken());
        int sum = 0;
        int [] student = new int [d];
        for(int i=0;i<n;i++) {
            student[i] = Integer.parseInt(br.readLine());
            sum += student[i];
        }
        for(int i=0;i<n;i++)
            System.out.println(d*student[i]/sum);
    }
}