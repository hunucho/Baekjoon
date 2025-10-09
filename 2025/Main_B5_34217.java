import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception{
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int A=sc.nextInt(), B=sc.nextInt();
        int C=sc.nextInt(), D=sc.nextInt();
        int H=A+C, Y=B+D;
        System.out.print(H==Y?"Either":H<Y?"Hanyang Univ.":"Yongdap");
    }
}