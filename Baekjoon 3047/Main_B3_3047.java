import java.util.*;

public class Main_B3_3047 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr= new int [] {sc.nextInt(),sc.nextInt(),sc.nextInt()};
		Arrays.sort(arr);
		String S=sc.next();
		for(int i=0;i<3;i++)
			System.out.print(arr[S.charAt(i)-'A']+" ");
	}
}
