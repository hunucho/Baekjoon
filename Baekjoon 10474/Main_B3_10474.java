import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int a=sc.nextInt(), b=sc.nextInt();
            if(a==b && a==0)
                break;
            System.out.println(a/b+" "+a%b+" / "+b);
        }
    }
}
