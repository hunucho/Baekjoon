import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		for(int t=0;t<T;t++) {
			int r=sc.nextInt(), c=sc.nextInt();
			sc.nextLine();
			char [][] box = new char [r][c];
			for(int i=0;i<r;i++)
				box[i]=sc.nextLine().toCharArray();
			int ans=0;
			for(int i=0;i<r;i++)
				for(int j=0;j<c-2;j++)
					if(box[i][j]=='>' && box[i][j+1]=='o' && box[i][j+2]=='<')
						ans++;
			for(int i=0;i<r-2;i++)
				for(int j=0;j<c;j++)
					if(box[i][j]=='v' && box[i+1][j]=='o' && box[i+2][j]=='^')
						ans++;
			System.out.println(ans);
		}
	}
}
