import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(f());
    }
    public static int f(){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt(),c= sc.nextInt(),n=sc.nextInt();
        for(int i=0;i<=50;i++)
            for(int j=0;j<=50;j++)
                for(int k=0;k<=50;k++)
                    if(a*i+b*j+c*k==n)
                        return 1;
        return 0;
    }
}
