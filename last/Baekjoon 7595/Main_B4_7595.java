import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int N=sc.nextInt();
            if(N==0)
                break;

            for(int i=1;i<=N;i++)
                System.out.println("*".repeat(i));
        }
    }
}