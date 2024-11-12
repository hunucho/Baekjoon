package silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_S5_1018 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken()), m=Integer.parseInt(st.nextToken());
		String[] arr=new String[n];
		for(int i=0;i<n;i++)
			arr[i] = br.readLine();		
		int min=Integer.MAX_VALUE;
		for(int i=0;i<n-7;i++) {		// 판이 8*8보다 클떄 시작점을 하나씩 옮김
			for(int j=0;j<m-7;j++) {
				int oddb=0, evenb=0, oddw=0, evenw=0;	// 위치에 맞는 Black or White를 저장하는 변수
				for(int k=0;k<8;k++) {					
					for(int l=0;l<8;l++) {
						if(arr[i+k].charAt(j+l)=='B') {		// Black일 때 even or odd 위치인지 확인
							if((i+k+j+l)%2==0)
								evenb++;
							else
								oddb++;
						}
						else if(arr[i+k].charAt(j+l)=='W') {	// White일 때 even or odd 위치 인지 확인
							if((i+k+j+l)%2==0)
								evenw++;
							else
								oddw++;
						}
					}
				}
				if(min>oddb+evenw || min>oddw+evenb)
					min=Math.min(oddb+evenw, oddw+evenb);
			}
		}
		System.out.println(min);
	}
}
