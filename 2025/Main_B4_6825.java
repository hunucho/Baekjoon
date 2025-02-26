import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        float w = sc.nextFloat(), h=sc.nextFloat(), t=w/h/h;
        System.out.println(t>=25?"Overweight":t>18.5?"Normal weight":"Underweight");
    }
}