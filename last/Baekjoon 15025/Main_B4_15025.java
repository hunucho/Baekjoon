import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int l=sc.nextInt(), r=sc.nextInt();
        if(l==0 && r==0)
            System.out.println("Not a moose");
        else
            System.out.println((l==r?"Even ":"Odd ")+ Math.max(l, r)*2);
    }
}