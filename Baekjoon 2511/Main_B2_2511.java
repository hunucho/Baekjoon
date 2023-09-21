import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int [10], brr = new int [10];
        char ans='D';
        for(int i=0;i<10;i++)
            arr[i]=sc.nextInt();
        for(int i=0;i<10;i++)
            brr[i]=sc.nextInt();
        int A=0, B=0, D=0;
        for(int i=0;i<10;i++){
            if(arr[i]>brr[i]) {
                A += 3;
                ans = 'A';
            }
            else if(arr[i]<brr[i]) {
                B += 3;
                ans = 'B';
            } else {
                A++;
                B++;
                D++;
            }
        }
        System.out.println(A+" "+B);
        if(A>B)
            ans='A';
        else if(A<B)
            ans='B';
        System.out.println(ans);


    }
}
