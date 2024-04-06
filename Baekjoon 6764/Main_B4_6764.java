import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int [4];
        boolean increase=true, decrease=true, identical=true;
        for(int i=0;i<4;i++)
            arr[i]=sc.nextInt();
        for(int i=1;i<4;i++) {
            if(arr[i-1]<=arr[i])
                decrease=false;
            if(arr[i-1]>=arr[i])
                increase=false;
            if(arr[i-1]!=arr[i])
                identical=false;
        }
        if(increase)
            System.out.println("Fish Rising");
        else if(decrease)
            System.out.println("Fish Diving");
        else if(identical)
            System.out.println("Fish At Constant Depth");
        else
            System.out.println("No Fish");

    }
}