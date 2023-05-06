import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int [3];
        for(int i=0;i<3;i++)
        	arr[i]=sc.nextInt();
        Arrays.sort(arr);
        int d1=arr[1]-arr[0], d2=arr[2]-arr[1];
        int d=Math.min(d1, d2), ans=0;
        if(d1==d2)
        	ans=arr[0]-d>=-100?arr[0]-d:arr[2]+d;
        else
        	ans=arr[0]+d!=arr[1]?arr[0]+d:arr[2]-d;
        System.out.println(ans);
    }
}
