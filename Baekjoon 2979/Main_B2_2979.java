import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int A=sc.nextInt(), B=sc.nextInt(), C=sc.nextInt(), ans=0;
        int [] arr = new int [101];
        for(int i=0;i<3;i++){
            int s=sc.nextInt(), e=sc.nextInt();
            for(int j=s+1;j<=e;j++)
                arr[j]++;
        }
        for(int i=1;i<=100;i++) {
            if (arr[i] == 1)
                ans += A;
            else if (arr[i] == 2)
                ans += B * 2;
            else if (arr[i] == 3)
                ans += C * 3;
        }
        System.out.println(ans);
    }
}
