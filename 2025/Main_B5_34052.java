import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t=0;
        for(int i=0;i<4;i++)
            t+=sc.nextInt();
        System.out.print(1800-t>=300?"Yes":"No");
    }
}