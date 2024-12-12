import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = f(sc.nextInt());
        if(arr[0]==0)
            System.out.println(-1);
        else
            for(int i=1;i<=4;i++)
                System.out.print(arr[i]+" ");
    }

    public static int [] f(int N){
        int [] ret = new int [5];
        ret[0]=0;
        for(int a=-N;a<=N;a++){
            if(a==0)
                continue;
            for(int c=-N/a;c<=N/a;c++){
                if(a*c!=N)
                    continue;;
                for(int b=-N-2;b<=N+2;b++){
                    if(b==0)
                        continue;;
                    for(int d=(-N-2)/b;d<=(N+2)/b;d++){
                        if(b*d!=-N-2)
                            continue;
                        if(a*d+b*c!=N+1)
                            continue;
                        ret[0]=1;
                        ret[1]=a;
                        ret[2]=b;
                        ret[3]=c;
                        ret[4]=d;
                        return ret;
                    }
                }
            }
        }
        return ret;
    }
}