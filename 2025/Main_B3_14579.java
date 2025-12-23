import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), sum=0, ans=1;
        for(int i=1;i<=a;i++)
            sum+=i;
        ans=sum;
        for(int i=a+1;i<=b;i++){
            sum+=i;
            ans=(ans*sum)%14579;
        }
        System.out.print(ans%14579);
    }
}