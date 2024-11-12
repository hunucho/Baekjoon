import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), K=sc.nextInt(), cnt=0;
        for(int i=0;i<K;i++) {
        	int tmp = sc.nextInt();
        	cnt+=tmp/2 + tmp%2;
        }
        System.out.println(cnt<N?"NO":"YES");
    }
}
