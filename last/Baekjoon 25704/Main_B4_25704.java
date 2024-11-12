import java.util.*;

class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt(), P=sc.nextInt(), ans=P;
        if(N>=20)
        	ans=(int) Math.min(P*0.75, P-2000);
        else if(N>=15)
        	ans=(int) Math.min(P-2000, P*0.9);
        else if(N>=10)
        	ans=(int) Math.min(P*0.9, P-500);
        else if(N>=5)
        	ans=(int) P-500;
        System.out.println(ans<0?0:ans);
    }
}
