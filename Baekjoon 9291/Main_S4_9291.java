import java.io.*;
import java.util.*;

class Main {
	static int [][] sudoku;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		for(int t=1;t<=T;t++) {
			sudoku = new int [9][9];
			for(int i=0;i<9;i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for(int j=0;j<9;j++)
					sudoku[i][j]=Integer.parseInt(st.nextToken());
			}
			System.out.printf("Case %d: %s\n", t, rows()&&cols()&&square()?"CORRECT":"INCORRECT");
			br.readLine();
		}
	}
	public static boolean rows() {
		for(int i=0;i<9;i++) {
			boolean [] chk = new boolean [10];
			for(int j=0;j<9;j++)
				if(chk[sudoku[i][j]])
					return false;
				else
					chk[sudoku[i][j]]=true;
		}
		return true;
	}
	
	public static boolean cols() {
		for(int j=0;j<9;j++) {
			boolean [] chk = new boolean [10];
			for(int i=0;i<9;i++)
				if(chk[sudoku[i][j]])
					return false;
				else
					chk[sudoku[i][j]]=true;
		}
		return true;
	}
	
	public static boolean square() {
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				boolean [] chk = new boolean [10];
				for(int ii=i*3;ii<(i+1)*3;ii++)
					for(int jj=j*3;jj<(j+1)*3;jj++)
						if(chk[sudoku[ii][jj]])
							return false;
						else
							chk[sudoku[ii][jj]]=true;				
			}
		}
		return true;
	}
}
