import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a=sc.nextDouble(), b=sc.nextDouble();
        System.out.printf("%f",1/(1+Math.pow(10,(b-a)/400)));
    }
}
