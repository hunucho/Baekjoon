import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double N=sc.nextDouble();
        int cnt=0;
        while(N>10){
            N=Math.round(N/10);
            cnt++;
        }
        System.out.println((int)(N*Math.pow(10,cnt)));
    }
}