import java.util.*;

class Main_S5_28307 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int C = sc.nextInt(), ans=0;
		sc.nextLine();
		int [][] arr = new int [2][C];
		for(int i=0;i<2;i++) {
			StringTokenizer st = new StringTokenizer(sc.nextLine());
			for(int j=0;j<C;j++) {
				arr[i][j]=Integer.parseInt(st.nextToken());
				if(arr[i][j]==1)
					ans+=3;
			}
		}
		for(int i=0;i<2;i++) {
			for(int j=0;j<C-1;j++) {
				if(arr[i][j]==1 && arr[i][j]==arr[i][j+1])
					ans-=2;
				if(i==1 && j%2==0 && arr[i][j]==1 && arr[i][j]==arr[i-1][j])
					ans-=2;
			}			
		}
		if(C%2==1 && arr[0][C-1]==1 && arr[1][C-1]==arr[0][C-1])
			ans-=2;
		System.out.println(ans);
	}
}
