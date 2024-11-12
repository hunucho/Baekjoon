import java.io.*;

public class Main_B1_10798 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char [][] arr = new char [5][15];
		for(int i=0;i<5;i++)
			arr[i]=br.readLine().toCharArray();
		for(int j=0;j<15;j++)
			for(int i=0;i<5;i++) {
				if(arr[i].length>j)
					System.out.print(arr[i][j]);
			}
	}
}
