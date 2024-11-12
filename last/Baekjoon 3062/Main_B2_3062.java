import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        for(int t=0;t<T;t++){
            String str=sc.next();
            int ori=Integer.parseInt(str), rev=0, tmp=ori;
            while(tmp>0){
                rev*=10;
                rev+=tmp%10;
                tmp/=10;
            }
            int sum=ori+rev;
            String s=String.valueOf(sum);
            StringBuilder sb=new StringBuilder();
            sb.append(String.valueOf(sum)).reverse();
            System.out.println(sb.toString().compareTo(s)==0?"YES":"NO");
        }
    }
}

//= 3.57142857142857