import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lv = sc.nextInt();
        String judge = sc.next();
        char ch = judge.charAt(0);
        if(ch=='m')
            lv=0;
        else if(ch=='b')
            lv*=200;
        else if(ch=='c')
            lv*=400;
        else if(ch=='g')
            lv*=600;
        else if(ch=='p')
            lv*=1000;
        System.out.print(lv);
    }
}