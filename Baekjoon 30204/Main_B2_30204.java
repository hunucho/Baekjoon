import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt(), X=sc.nextInt(), tmp=0;
        for(int i=0;i<N;i++)
            tmp+=sc.nextInt();
        System.out.println(tmp%X==0?1:0);
    }
}
