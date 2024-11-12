import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        for(int t=0;t<T;t++){
            int A=sc.nextInt(), B=sc.nextInt();
            System.out.println(A%B==0?((A/B)*(A/B)):(((A/B)+1)*((A/B)+1)));
        }
    }
}