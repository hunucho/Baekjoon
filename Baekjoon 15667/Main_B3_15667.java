import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        for(int i=1;i<=10101;i++){
            if(i*i+i+1==N) {
                System.out.println(i);
                break;
            }
        }
    }
}