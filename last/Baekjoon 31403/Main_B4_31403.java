import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int A=sc.nextInt(), B=sc.nextInt(), C=sc.nextInt();
        System.out.println(A+B-C);
        String D= "";
        D+=A;
        D+=B;
        System.out.println(Integer.parseInt(D)-C);
    }
}