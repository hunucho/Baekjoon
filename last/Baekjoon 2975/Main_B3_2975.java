import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int N=sc.nextInt();
            char T=sc.next().charAt(0);
            int M=sc.nextInt();
            if(N==0 && T=='W' && M==0)
                break;
            if(T=='W'){
                if(N-M<-200)
                    System.out.println("Not allowed");
                else
                    System.out.println(N-M);
            } else
                System.out.println(N+M);

        }

    }
}