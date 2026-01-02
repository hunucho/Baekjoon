import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long N=sc.nextInt(), M=sc.nextInt(), S=sc.nextInt();
        long per = S*(M+1)*(100-N)/100, plus = S*M;
        System.out.print(Math.min(per, plus));
    }
}