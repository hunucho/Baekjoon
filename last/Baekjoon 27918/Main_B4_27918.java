import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt(), D=0, P=0;
        for(int i=0;i<N;i++){
            String S = sc.next();
            if(S.compareTo("D")==0)
                D++;
            else
                P++;
            if(D>P+1 || P>D+1)
                break;
        }
        System.out.printf("%d:%d",D,P);
    }
}