import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        for(int i=0;i<4;i++)
            sum+=sc.nextInt();
        System.out.println(Math.max(sc.nextInt()*4-sum, 0));
    }
}