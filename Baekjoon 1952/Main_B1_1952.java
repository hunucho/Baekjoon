import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M= sc.nextInt(), N=sc.nextInt();
        if(N==M)
        	System.out.println(2*(N-1));
        else if(M>N)
        	System.out.println(2*(N-1)+1);
        else
        	System.out.println(2*(M-1));
    }
}
