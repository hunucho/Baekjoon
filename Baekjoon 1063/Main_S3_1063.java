package silver;

import java.io.*;
import java.util.*;

public class Main_S3_1063 {
	static int kx,ky,px,py;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		ky=str.charAt(0)-'A';
		kx=str.charAt(1)-'1';
		py=str.charAt(3)-'A';
		px=str.charAt(4)-'1';
		int n=Integer.parseInt(str.substring(6));
		for(int i=0;i<n;i++) {
			String op = br.readLine();
			int pkx=kx, pky=ky, ppx=px, ppy=py;
			if(movek(op, pkx, pky)) {
				continue;
			}
			else {
				kx=pkx;
				ky=pky;
				px=ppx;
				py=ppy;
			}
		}
		System.out.println((char)(ky+'A')+""+(int)(kx+1));
		System.out.println((char)(py+'A')+""+(int)(px+1));
	}
	static boolean movek(String op, int x, int y) {
		if(op.contains("R"))
			y++;
		else if(op.contains("L"))
			y--;
		if(op.contains("T"))
			x++;
		else if(op.contains("B"))
			x--;
		if(chkCollision(x, y))
			if(!movep(op, px, py))
				return false;
		
		if(x>=0 && x<8 && y>=0 && y<8) {
			kx=x;
			ky=y;
			return true;
		}
		return false;
	}
	
	static boolean movep(String op, int x, int y) {
		if(op.contains("R"))
			y++;
		else if(op.contains("L"))
			y--;
		if(op.contains("T"))
			x++;
		else if(op.contains("B"))
			x--;
		if(x>=0 && x<8 && y>=0 && y<8) {
			px=x;
			py=y;
			return true;
		}
		return false;
	}
	
	static boolean chkCollision(int x, int y) {
		if(x==px && y==py)
			return true;
		return false;
	}
}

