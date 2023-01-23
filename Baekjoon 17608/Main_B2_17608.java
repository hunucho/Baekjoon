import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), ans=1, max;
        int[] arr = new int[N];
        for (int i = 0; i < N; i++)
            arr[i] = sc.nextInt();
        max=arr[N-1];
        for(int i=N-2;i>=0;i--){
            if(arr[i]>max) {
                max = arr[i];
                ans++;
            }
        }
        System.out.println(ans);
    }
}
