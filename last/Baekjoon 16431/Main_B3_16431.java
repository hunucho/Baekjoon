import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Br=sc.nextInt(), Bc=sc.nextInt();
        int Dr=sc.nextInt(), Dc=sc.nextInt();
        int Jr=sc.nextInt(), Jc=sc.nextInt();
        int distB=Math.abs(Br-Jr)+Math.abs(Bc-Jc);
        int distr=Math.abs(Br-Jr), distc=Math.abs(Jc-Bc);
        distB-=Math.min(distr, distc);

        int distD=Math.abs(Dr-Jr)+Math.abs(Dc-Jc);

        System.out.println(distB==distD?"tie":distB>distD?"daisy":"bessie");
    }
}
