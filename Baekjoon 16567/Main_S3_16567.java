import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int N=sc.nextInt(), M=sc.nextInt(), cnt=0;
        int [] arr = new int[N+2];
        for(int i=1;i<=N;i++) {
            arr[i] = sc.nextInt();
            if(arr[i]==1 && arr[i-1]==0)
                cnt++;
        }
        for(int i=0;i<M;i++){
            int tmp=sc.nextInt();
            if(tmp==0)
                sb.append(cnt+"\n");
            else {
                int val=sc.nextInt();
                if(arr[val]==1)
                    continue;
                else if(arr[val-1]==0 && arr[val+1]==0)
                    cnt++;
                else if(arr[val-1]==1 && arr[val+1]==1)
                    cnt--;
                arr[val]=1;
            }
        }
        System.out.println(sb.toString());
    }
}
