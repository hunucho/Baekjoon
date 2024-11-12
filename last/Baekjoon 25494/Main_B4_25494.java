import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        for(int t=0;t<T;t++){
            int a=sc.nextInt(), b=sc.nextInt(), c=sc.nextInt(), ans=0;
            for(int x=1;x<=a;x++){
                for(int y=1;y<=b;y++){
                    for(int z=1;z<=c;z++){
                        if(x%y==y%z && y%z==z%x)
                            ans++;
                    }
                }
            }
            System.out.println(ans);
        }
    }
}