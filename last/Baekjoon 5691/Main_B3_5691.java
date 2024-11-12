import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int A=sc.nextInt(), B=sc.nextInt();
            if(A==0 && B==0)
                break;
            int min=Math.min(A,B), max=Math.max(A,B);
            int d=max-min;
            System.out.println(A-d);
        }
    }
}
