import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		TreeSet<Integer> [] cards = new TreeSet [2];
		cards[0] = new TreeSet<>();
		cards[1] = new TreeSet<>();
		int cur=0, turn = 0;
		boolean [] chk = new boolean [N*2+1];
		for(int i=0;i<N;i++) {
			int tmp = sc.nextInt();
			cards[0].add(tmp);
			chk[tmp]=true;
		}
		for(int i=1;i<=2*N;i++)
			if(!chk[i])
				cards[1].add(i);
		while(cards[0].size()>0 && cards[1].size()>0) {
			if(cards[turn].higher(cur)!=null) {
				cur=cards[turn].higher(cur);
				cards[turn].remove(cur);
			}
			else
				cur=0;
			turn = (turn+1)%2;
		}
		System.out.println(cards[1].size()+"\n"+cards[0].size());
		
	}
}
