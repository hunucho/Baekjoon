import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt(), P=sc.nextInt(), prev=A;
        HashSet<Integer> hs = new HashSet<>();
        while(!hs.contains(prev)){
            hs.add(prev);
            int cur=0;
            while(prev>0){
                cur+=Math.pow(prev%10, P);
                prev/=10;
            }
            prev=cur;
        }
        while(hs.contains(prev)){
            hs.remove(prev);
            int cur=0;
            while(prev>0){
                cur+=Math.pow(prev%10, P);
                prev/=10;
            }
            prev=cur;
        }
        System.out.println(hs.size());
    }
}
