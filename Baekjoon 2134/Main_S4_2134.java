import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken()), m=Integer.parseInt(st.nextToken()), k=Integer.parseInt(st.nextToken());
        int sizea=0, sizeb=0;
        long ans=0;
        int [] arr = new int [n+1], brr = new int [m+1];
        for(int i=1;i<=n;i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sizea+=arr[i];
        }
        for(int i=1;i<=m;i++){
            brr[i]=Integer.parseInt(br.readLine());
            sizeb+=brr[i];
        }
        int size = Math.min(sizea, sizeb);
        sizea=sizeb=size;

        for(int i=1;i<=n;i++){
            if(arr[i]>sizea) {
                ans += sizea * i;
                break;
            } else {
                ans += arr[i] * i;
                sizea-=arr[i];
            }
        }
        for(int i=1;i<=m;i++){
            if(brr[i]>sizeb) {
                ans += sizeb * i;
                break;
            } else {
                ans += brr[i] * i;
                sizeb -=brr[i];
            }
        }
        System.out.println(size+" "+ans);
    }
}