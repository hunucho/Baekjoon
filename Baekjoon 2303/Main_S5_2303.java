import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt(), ans=0, last=0, tmp=0;
        int [] arr = new int [5];
        for(int i=1;i<=N;i++){
            for(int j=0;j<5;j++)
                arr[j]=sc.nextInt();
            for(int x=0;x<3;x++){
                for(int y=x+1;y<4;y++){
                    for(int z=y+1;z<5;z++){
                        tmp = (arr[x]+arr[y]+arr[z])%10;
                        if(last<=tmp){
                            ans=i;
                            last=tmp;
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }
}