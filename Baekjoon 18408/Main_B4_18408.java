import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int one=0, two=0;
        for (int i = 0; i < 3; i++) {
            int tmp= sc.nextInt();
            if(tmp==1)
                one++;
            else
                two++;
        }
        System.out.println(one>two?1:2);
    }
}