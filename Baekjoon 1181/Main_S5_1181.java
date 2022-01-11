package silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main_S5_1181 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[][] arr = new String[51][n];
		Integer[] cnt=new Integer[51];
		
		Arrays.fill(cnt, 0);
		for(int i=0;i<n;i++) {			// 단어를 입력받으면서 단어의 길이를 측정하여 그 길이의 칸에 넣어주며 몇개의 단어가 있는지 카운팅함
			String temp=br.readLine();
			arr[temp.length()][cnt[temp.length()]++]=temp;
		}
	
		for(int i=1;i<51;i++) {
			Arrays.sort(arr[i], 0, cnt[i]);		// 저장된 단어에서 0부터 존재하는 갯수만큼만 정렬
			
			String prev="";
			for(int j=0;j<cnt[i];j++) {
				if(prev.compareTo(arr[i][j])!=0) {	// 최근의 출력한 값을 저장하여 그 값과 다르면 출력, 같으면 넘어간다
					prev=arr[i][j];
					System.out.println(arr[i][j]);					
				}
			}
		}
	}

}
