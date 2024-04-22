import java.io.*;
import java.util.*;

class Main {
    static int [] arr;
    static int N;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N=sc.nextInt();
        arr = new int [N];
        for(int i=0;i<N;i++)
            arr[i]=sc.nextInt();
        int d=isArithmetical(), r=isGeometric();
        if(d>0){
            System.out.println(arr[N-1]+d);
        } else {
            System.out.println(arr[N-1]*r);
        }
    }

    static int isArithmetical () {
        int d = arr[1]-arr[0];
        for(int i=2;i<N;i++){
            if(d!=arr[i]-arr[i-1])
                return -1;
        }
        return d;
    }

    static int isGeometric(){
        int r = arr[1]/arr[0];
        for(int i=2;i<N;i++){
            if(r!=arr[i]/arr[i-1])
                return -1;
        }
        return r;
    }
}