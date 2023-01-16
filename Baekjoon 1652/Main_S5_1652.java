import java.util.*;

public class Main_S5_1652 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), x=0, y=0;
		boolean f=false;
		sc.nextLine();
		String [] arr = new String [N];
		for(int i=0;i<N;i++)
			arr[i]=sc.nextLine();
		for(int i=0;i<N;i++) {
			f=false;
			for(int j=0;j<N-1;j++) {
				if(arr[i].charAt(j)==arr[i].charAt(j+1) && arr[i].charAt(j)=='.' && !f) {
					x++;
					f=true;
				}
				else if(arr[i].charAt(j)!=arr[i].charAt(j+1))
					f=false;
			}
		}
		for(int j=0;j<N;j++) {
			f=false;
			for(int i=0;i<N-1;i++) {
				if(arr[i].charAt(j)==arr[i+1].charAt(j) && arr[i].charAt(j)=='.' && !f) {
					y++;
					f=true;
				}
				else if(arr[i].charAt(j)!=arr[i+1].charAt(j))
					f=false;
			}
		}
		System.out.println(x+" "+y);
	}
}
