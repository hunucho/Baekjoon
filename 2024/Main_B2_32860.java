import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt(), M=sc.nextInt();
        System.out.print("SN "+N);
        if(M<=26)
            System.out.println((char)('A'+M-1));
        else
            System.out.println((char)('a'+((M-1)/26)-1)+""+(char)('a'+((M-1)%26)));
    }
}