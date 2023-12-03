import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt(), ans=0;
        int [] arr = new int [N];
        for(int i=0;i<N;i++)
            arr[i]=sc.nextInt();
        for(int i=N-1;i>0;i--){
            if(arr[i]<=arr[i-1]){
                ans+=arr[i-1]-arr[i]+1;
                arr[i-1]=arr[i]-1;
            }
        }
        System.out.println(ans);
    }
}
