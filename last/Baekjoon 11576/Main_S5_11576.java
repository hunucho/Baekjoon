import java.util.*;

public class Main_S5_11576 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A=sc.nextInt(), B=sc.nextInt(), m=sc.nextInt(), tmp=0, j=0;
		ArrayList<Integer> al = new ArrayList<>();
		for(int i=m-1;i>=0;i--)
			tmp+=Math.pow(A, i)*sc.nextInt();
		while(tmp>0) {
			al.add(tmp%B);
			tmp/=B;
		}
		for(int i=al.size()-1;i>=0;i--)
			System.out.print(al.get(i)+" ");
	}
}
