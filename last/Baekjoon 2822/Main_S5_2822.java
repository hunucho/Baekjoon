import java.util.*;

public class Main_S5_2822 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [][] arr = new int[8][2];
		int sum=0;
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int i=0;i<8;i++) {
			arr[i][0]=sc.nextInt();
			arr[i][1]=i;
		}
		Arrays.sort(arr, Comparator.comparing(o1 -> o1[0]));
		for(int i=3;i<8;i++) {
			sum+=arr[i][0];
			pq.add(arr[i][1]);
		}
		System.out.println(sum);
		while(pq.size()>0)
			System.out.print(pq.poll()+1+" ");		
	}
}
