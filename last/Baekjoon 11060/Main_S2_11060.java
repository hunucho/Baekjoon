import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int [] A = new int [N], B = new int [N];
        Queue<int []> q = new LinkedList<>();
        Arrays.fill(B, 9999);
        B[0]=0;
        for(int i=0;i<N;i++)
            A[i]=sc.nextInt();
        q.add(new int []{0, 0});
        while(q.size()>0){
            int pos=q.peek()[0], cnt=q.poll()[1];
            for(int i=1;i<=A[pos];i++) {
                if(pos+i<N)
                    if(B[pos+i]==9999) {
                        q.add(new int [] {pos+i, cnt+1});
                        B[pos+i]=cnt+1;
                    }
            }
        }
        System.out.println(B[N-1]==9999?"-1":B[N-1]);
    }
}
