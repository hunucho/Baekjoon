import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int D=sc.nextInt(), H=sc.nextInt(), M=sc.nextInt();
        int T=D*1440+H*60+M - 16511;
        System.out.println(T<0?-1:T);
    }
}
