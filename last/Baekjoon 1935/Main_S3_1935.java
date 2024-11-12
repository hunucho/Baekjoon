import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        String expr = sc.next();
        int [] nums = new int [N];
        for(int i=0;i<N;i++)
            nums[i]=sc.nextInt();

        Stack<Double> s = new Stack<>();
        for(char ch:expr.toCharArray()){
            if('A'<=ch && ch<='Z')
                s.push((double) nums[ch-'A']);
            else {
                double b = s.pop(), a = s.pop();
                if (ch == '+') {
                    s.push(a + b);
                } else if (ch == '-') {
                    s.push(a-b);
                } else if (ch == '*') {
                    s.push(a*b);
                } else if (ch == '/') {
                    s.push(a/b);
                }
            }
        }
        System.out.printf("%.2f",s.pop());
    }
}
