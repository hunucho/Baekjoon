import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashMap<Integer, int []> hm = new HashMap<>();
        for(int i=0;i<8;i++)
            for(int j=0;j<8;j++)
                hm.put((int)(Math.pow(2, i)+Math.pow(2, j)), new int []{i, j});
        int [] key = new int [8];
        for(int i=0;i<8;i++)
            key[i]=i;
        for(int i=0;i<N;i++){
            int a=Integer.parseInt(st.nextToken());
            if(hm.containsKey(a)){
                swap(key, hm.get(a)[0], hm.get(a)[1]);
            }
        }
        System.out.println(key[Integer.parseInt(br.readLine())]);
    }
    public static void swap(int [] arr, int a, int b){
        int tmp = arr[a];
        arr[a]=arr[b];
        arr[b]=tmp;
    }
}

