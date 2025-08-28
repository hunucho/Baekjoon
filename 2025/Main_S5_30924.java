import java.io.*;
import java.net.CookieHandler;
import java.util.*;

public class Main {
    public static void main(String[] args) throws  Exception{
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>(), brr = new ArrayList<>();
        for(int i=1;i<=10000;i++) {
            arr.add(i);
            brr.add(i);
        }
        Collections.shuffle(arr);
        Collections.shuffle(brr);
        int A=10000, B=10000;
        for(int a=0; a<10000; a++){
            System.out.println("? A "+arr.get(a));
            System.out.flush();
            int resp = sc.nextInt();
            if(resp==1) {
                A=arr.get(a);
                break;
            }
        }
        for(int b=0; b<10000; b++){
            System.out.println("? B "+brr.get(b));
            System.out.flush();
            int resp = sc.nextInt();
            if(resp==1) {
                B = brr.get(b);
                break;
            }
        }
        System.out.println("! "+(A+B));
    }
}