import java.util.*;

class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringTokenizer st1 = new StringTokenizer(sc.nextLine(),":"), st2=new StringTokenizer(sc.nextLine(),":");
        int h1=Integer.parseInt(st1.nextToken()), m1=Integer.parseInt(st1.nextToken());
        int h2=Integer.parseInt(st2.nextToken()), m2=Integer.parseInt(st2.nextToken());
        int ans=0;
        if(m2>=m1)
        	ans+=m2-m1;
        else {
        	h1=(h1+1)%24;
        	ans+=60-m1+m2;
        }
        
        if(h2>=h1)
        	ans+=h2-h1;
        else
        	ans+=24-h1+h2;
      
        
        System.out.println(ans);
    }
}
