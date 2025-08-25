import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int A=sc.nextInt(), T=sc.nextInt(), flag=sc.nextInt();
        int cnt=4, pos=0;
        while(cnt<T){
            T-=cnt;
            pos=(pos+cnt*2)%A;
            cnt++;
        }
        for(int i=0;i<4 && T>0;i++){
            if(i%2==flag) {
                T--;
                if(T==0)
                    break;
            }
            pos=(pos+1)%A;
        }
        if(T>0){
            if(flag==0)
                pos = (pos+(T-1))%A;
            else
                pos = (pos+(cnt-2)+(T-1))%A;
        }
        System.out.print(pos);
    }
}