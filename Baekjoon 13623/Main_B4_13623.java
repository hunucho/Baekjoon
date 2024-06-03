import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int A=sc.nextInt(), B=sc.nextInt(), C=sc.nextInt();
        char ans='*';
        if(A==B && B!=C)
            ans='C';
        else if(B==C && C!=A)
            ans='A';
        else if(A==C && C!=B)
            ans='B';
        System.out.println(ans);
    }

}