import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mbti=sc.next();
        System.out.print(mbti.charAt(0)=='E'?"I":"E");
        System.out.print(mbti.charAt(1)=='S'?"N":"S");
        System.out.print(mbti.charAt(2)=='T'?"F":"T");
        System.out.print(mbti.charAt(3)=='J'?"P":"J");
    }
}