import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        while(true){
            int a=sc.nextInt(), b=sc.nextInt(), c=sc.nextInt(), d=sc.nextInt();
            if(a==0 && b==0 && c==0 && d==0)
                break;
            System.out.println((c-b)+" "+(d-a));
        }
    }
}