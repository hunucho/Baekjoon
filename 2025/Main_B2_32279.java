import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int [] a = new int [n+1];
        int p=sc.nextInt(), q=sc.nextInt(), r=sc.nextInt(), s=sc.nextInt();
        a[1]=sc.nextInt();
        int ans=a[1];
        for(int i=2;i<=n;i++){
            if(i%2==0)
                a[i]=p*a[i/2]+q;
            else
                a[i]=r*a[i/2]+s;
            ans+=a[i];
        }
        System.out.println(ans);
    }
}