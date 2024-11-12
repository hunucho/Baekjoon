import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int [] arr = new int[N];
        for(int i=0;i<N;i++)
        	arr[i]=sc.nextInt();
        int size=sc.nextInt();
        long ans=0;
        for(int i=0;i<N;i++) {
        	ans+=(arr[i]/size)*size+(arr[i]%size>0?size:0);
        }
        System.out.println(ans);
    }
}
