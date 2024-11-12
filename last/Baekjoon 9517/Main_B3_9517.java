import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K=sc.nextInt()-1, N=sc.nextInt(), t=0;
        for(int i=0;i<N;i++){
            t+=sc.nextInt();
            if(t>=210)
                break;
            String Z=sc.nextLine().trim();
            if(Z.equals("T"))
                K++;
        }
        System.out.println((K%8)+1);
    }
}
