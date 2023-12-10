import java.util.*;

public class Main {
    static int [] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt(), ans=0;
        arr = new int [N];
        for(int i=0;i<N;i++)
            arr[i]=sc.nextInt();
        Arrays.sort(arr);
        for(int i=0;i<N;i++)
            ans+=isGood(0, N-1, i)?1:0;
        System.out.println(ans);
    }
    public static boolean isGood(int s, int e, int target){
        while(s<e){
            if(target==s) {
                s++;
                continue;
            }
            if(target==e) {
                e--;
                continue;
            }
            int sum=arr[s]+arr[e];
            if(sum==arr[target])
                return true;
            else if(sum>arr[target])
                e--;
            else
                s++;
        }
        return false;
    }
}
