import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char [] in = sc.nextLine().toCharArray();
        System.out.println(in[0]-'0'+in[4]-'0'==in[8]-'0'?"YES":"NO");
    }
}
