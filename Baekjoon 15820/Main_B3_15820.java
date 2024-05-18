import java.util.*;

class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S1=sc.nextInt(), S2=sc.nextInt();
        boolean sample=true, tc=true;
        for(int i=0;i<S1;i++) {
        	int a=sc.nextInt(), b=sc.nextInt();
        	if(a!=b)
        		sample=false;
        }
        for(int i=0;i<S2;i++) {
        	int a=sc.nextInt(), b=sc.nextInt();
        	if(a!=b)
        		tc=false;
        }
        if(sample && tc)
        	System.out.println("Accepted");
        else if(!sample)
        	System.out.println("Wrong Answer");
        else if(!tc)
        	System.out.println("Why Wrong!!!");
        
    }
}

