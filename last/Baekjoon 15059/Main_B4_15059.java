import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int [3];
        int ans=0;
        for(int i=0;i<3;i++)
            arr[i]=sc.nextInt();
        for(int i=0;i<3;i++) {
            arr[i] -= sc.nextInt();
            if(arr[i]<0)
                ans-=arr[i];
        }
        System.out.println(ans);
    }
}
