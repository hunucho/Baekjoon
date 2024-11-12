package silver;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main_S4_1913 {
	
	public static void main(String[] args) throws Exception{
		int [][] arr = new int[1000][1000];
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n =sc.nextInt(), m=sc.nextInt(),x = 0,y=0;
		int cnt=n*n, i=0, j=0, direct=0, correction=0,temp=0, hold=n ;
		while(cnt>0) {
			arr[i+correction][j+correction]=cnt--;
			temp++;
			switch(direct) {
			case 0: i++; if(temp==hold-1) { direct=1; temp=0;} break;
			case 1: j++; if(temp==hold-1) { direct=2; temp=0;} break;
			case 2: i--; if(temp==hold-1) { direct=3; temp=0;} break;
			case 3: j--; if(temp==hold-1) { direct=0; temp=0; hold-=2; correction++;} break;
			}
			
		}
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				bw.write(arr[i][j]+" ");
				if(arr[i][j]==m){
					x=i+1;
					y=j+1;
				}
			}
			bw.write("\n");
		}
		bw.write(x+" "+y);
		bw.close();
	}

}
