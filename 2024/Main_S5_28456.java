import java.util.*;
public class Main {
    static int [][] arr;
    static int N;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        arr = new int [N+1][N+1];
        for(int i=1;i<=N;i++)
            for(int j=1;j<=N;j++)
                arr[i][j]=sc.nextInt();
        int Q=sc.nextInt();
        for(int i=0;i<Q;i++){
            int sw = sc.nextInt();
            if(sw==1){
                push(sc.nextInt());
            } else {
                rotate();
            }
        }
        for(int i=1;i<=N;i++){
            for(int j=1;j<=N;j++)
                System.out.print(arr[i][j]+" ");
            System.out.println();
        }
    }

    public static void push(int k){
        int tmp=arr[k][N];
        for(int i=N;i>1;i--)
            arr[k][i]=arr[k][i-1];
        arr[k][1]=tmp;
    }

    public static void rotate() {
        int [][] brr = new int [N+1][N+1];
        for(int i=1;i<=N;i++){
            for(int j=1;j<=N;j++){
                brr[j][N-i+1]=arr[i][j];
            }
        }
        arr = brr;
    }
}