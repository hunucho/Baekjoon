import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine(), C=sc.nextLine();
        int lenori=S.length();
        S=S.replaceAll(C,"");
        System.out.println((lenori-S.length())/C.length());
    }
}
