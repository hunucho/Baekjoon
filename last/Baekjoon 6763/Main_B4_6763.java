import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt(), b=sc.nextInt();
        System.out.println(b-a>=31?"You are speeding and your fine is $500.":b-a>=21?"You are speeding and your fine is $270.":b-a>=1?"You are speeding and your fine is $100.":"Congratulations, you are within the speed limit!");
    }
}
