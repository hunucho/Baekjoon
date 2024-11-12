import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int A=sc.nextInt(), B=sc.nextInt(), C=sc.nextInt();
            int a=B-A, b=C-B;
            System.out.println(Math.max(a,b)-1);
        }
    }
}