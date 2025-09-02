import java.util.*;

public class Main {
    public static void main(String[] args) throws  Exception{
        Scanner sc = new Scanner(System.in);
        int M=sc.nextInt();
        int ans=1, dir=0;
        for(int i=0;i<M;i++){
            ans/=sc.nextInt();
            ans*=sc.nextInt();
            dir=(dir+sc.nextInt())%2;
        }
        System.out.println(dir +" "+ ans);
    }
}