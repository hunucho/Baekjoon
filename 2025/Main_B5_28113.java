import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), A=sc.nextInt(), B=sc.nextInt();
        String ans="Anything";
        if(A-N<B-N)
            ans = "Bus";
        else if(A-N>B-N)
            ans = "Subway";
        System.out.println(ans);
    }
}