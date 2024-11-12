import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt(), B=sc.nextInt();
        for(int L=3;;L++){
            int W = R / 2 - L + 2;
            if ((L - 2) * (W - 2) == B) {
                System.out.println(W + " " + L);
                break;
            }
        }
    }
}