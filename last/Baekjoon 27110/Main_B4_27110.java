import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt(), a=0;
        while(sc.hasNext())
            a+=Math.min(N,sc.nextInt());
        System.out.println(a);
    }
}
