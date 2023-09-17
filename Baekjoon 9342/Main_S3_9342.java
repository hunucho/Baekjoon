import java.util.*;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        sc.nextLine();
        String pattern = "^[ABCDEF]?A+F+C+[ABCDEF]?$";
        for(int i=0;i<N;i++){
            String str = sc.nextLine();
            System.out.println(Pattern.matches(pattern,str)?"Infected!":"Good");
        }
    }
}
