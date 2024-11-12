import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		Candi [] candi = new Candi [3];
		for(int i=0;i<3;i++)
			candi[i] = new Candi(i+1);
		for(int i=0;i<N;i++) {
			for(int j=0;j<3;j++) {
				int tmp=sc.nextInt();
				if(tmp==3) {
					candi[j].first++;
					candi[j].sum+=3;
				} else if(tmp==2) {
					candi[j].second++;
					candi[j].sum+=2;
				} else {
					candi[j].third++;
					candi[j].sum+=1;
				}
			}
		}
		Arrays.sort(candi);
		System.out.println(candi[0].first==candi[1].first && candi[0].second==candi[1].second?0+" "+candi[0].sum:candi[0].id+" "+candi[0].sum);
		
	}
	
	static class Candi implements Comparable<Candi>{
		int id, first, second, third, sum;
		
		public Candi(int id) {
			this.id = id;
		}
		
		@Override
		public int compareTo(Main.Candi o) {
			if(this.sum>o.sum)
				return -1;
			else if(this.sum<o.sum)
				return 1;
			
			if(this.first>o.first)
				return -1;
			else if(this.first<o.first)
				return 1;
			
			if(this.second>o.second)
				return -1;
			else if(this.second<o.second)
				return 1;
			return 0;
		}
	}
}
