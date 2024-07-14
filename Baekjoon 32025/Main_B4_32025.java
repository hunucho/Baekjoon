import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int H=sc.nextInt(), W=sc.nextInt();
        System.out.println(Math.min(H,W)*50);
    }
}