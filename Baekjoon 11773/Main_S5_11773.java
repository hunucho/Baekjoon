import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int A=sc.nextInt(), B=sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<(A+B)/2;i++) {
            int tmp = i;
            String S = "";
            while (true) {
                S += (char) (tmp % 26 + 'a');
                tmp /= 26;
                if (tmp == 0)
                    break;
            }
            sb.append(S).append(" ");
        }
        System.out.println(sb.toString());
    }
}