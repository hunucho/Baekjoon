import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt(), b=sc.nextInt();
        System.out.println((double)(a*(100-b)/100)>=100?0:1);
    }
}