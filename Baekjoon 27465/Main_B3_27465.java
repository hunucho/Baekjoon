import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        System.out.println(N<4?4:N%2==0?N:N+1);
    }
}
