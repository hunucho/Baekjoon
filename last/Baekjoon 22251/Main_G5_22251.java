import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt(), K=sc.nextInt(), P=sc.nextInt(), X=sc.nextInt(), ans=0; 
		boolean [][] digit = new boolean [][] {
			{true, true, true, false, true, true, true},
			{false, false, true, false, false, true, false}, 
			{true, false, true, true, true, false, true}, 
			{true, false, true, true, false, true, true}, 
			{false, true, true, true, false, true, false}, 
			{true, true, false, true, false, true, true}, 
			{true, true, false, true, true, true, true}, 
			{true, false, true, false, false, true, false}, 
			{true, true, true, true, true, true, true}, 
			{true, true, true, true, false, true, true}, 
			};
		for(int i=1;i<=N;i++) {		// From Ground to Rooftop
			int cnt=0, tmp=i, target=X;	// count diff, temp floor, target floor
			
			for(int j=0;j<K && cnt<=P;j++) {
				for(int k=0;k<7;k++)
					if(digit[tmp%10][k]!=digit[target%10][k])
						cnt++;
				tmp/=10;
				target/=10;
			}
			
			if(1<=cnt && cnt<=P)
				ans++;
		}
		System.out.println(ans);
	}
}
/*
  0
1   2
  3
4	5
  6
*/

