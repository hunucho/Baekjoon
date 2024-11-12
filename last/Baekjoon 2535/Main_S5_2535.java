import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt(), out=0;
		int [] cnt = new int [101];
		int [][] S = new int [N][3];
		for(int i=0;i<N;i++)
			for(int j=0;j<3;j++)
				S[i][j]=sc.nextInt();
		Arrays.sort(S, (o1, o2) -> o2[2]-o1[2]);
		for(int i=0;i<N && out<3;i++) {
			if(cnt[S[i][0]]<2) {
				System.out.println(S[i][0]+" "+S[i][1]);
				cnt[S[i][0]]++;
				out++;
			}
		}
	}
}
