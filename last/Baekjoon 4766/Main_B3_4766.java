import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double prev = sc.nextDouble();
        while(true){
            double cur=sc.nextDouble();
            if(cur==999)
                break;
            System.out.printf("%.2f\n",cur-prev);
            prev=cur;
        }
    }
}
