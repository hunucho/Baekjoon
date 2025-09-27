import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws  Exception {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int [3];
        for(int i=0;i<3;i++)
            arr[i]=sc.nextInt();
        System.out.println(arr[2]-arr[0]);
    }
}
