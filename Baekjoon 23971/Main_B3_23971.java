import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H=sc.nextInt(), W=sc.nextInt(), N=sc.nextInt(), M=sc.nextInt();
        System.out.println((int)(Math.ceil(H/(N+1.0))* Math.ceil(W / (M + 1.0))));
    }
}
