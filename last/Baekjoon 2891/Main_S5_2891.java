import java.util.*;

public class Main_S5_2891 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(), s=sc.nextInt(), r=sc.nextInt(), ans=0;
		boolean [] cayak = new boolean [n+2];
		Arrays.fill(cayak, true);
		for(int i=0;i<s;i++)
			cayak[sc.nextInt()]=false;
		int [] spare = new int [r];
		for(int i=0;i<r;i++)
			spare[i]=sc.nextInt();
		Arrays.sort(spare);
		for(int i=0;i<r;i++) {
			if(!cayak[spare[i]])
				cayak[spare[i]]=true;
			else if(!cayak[spare[i]-1])
				cayak[spare[i]-1]=true; 
			else
				cayak[spare[i]+1]=true;
		}
		for(int i=1;i<=n;i++)
			if(!cayak[i])
				ans++;
		System.out.println(ans);
	}
}
