import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int e=sc.nextInt()+sc.nextInt(), c=sc.nextInt(), ans=0;
        while(e>=c){
            int tmp=e/c;
            ans+=e/c;
            e=e%c+tmp;
        }
        System.out.println(ans);
    }

}
