import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int m=sc.nextInt(), Seed=sc.nextInt(), X1=sc.nextInt(), X2=sc.nextInt();

        for(int a=0;a<m;a++){
            for(int c=0;c<m;c++)
                if((a*Seed + c)%m == X1)
                    if((a*X1 + c)%m == X2) {
                        System.out.println(a+" "+c);
                        return;
                    }
        }
    }
}