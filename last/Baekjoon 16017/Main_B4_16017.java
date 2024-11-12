import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(f());
    }
    public static String f(){
        Scanner sc = new Scanner(System.in);
        int [] a = new int [4];
        for(int i=0;i<4;i++)
            a[i]=sc.nextInt();
        if(a[0]==8||a[0]==9)
            if(a[1]==a[2])
                if(a[3]==8||a[3]==9)
                    return "ignore";
        return "answer";
    }
}
