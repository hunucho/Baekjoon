package gold;

import java.io.*;
import java.util.*;

public class Main_G2_12100 {
	static int n, ans;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(br.readLine());
		int [][] arr = new int[n][n];
		for(int i=0;i<n;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0;j<n;j++)
				arr[i][j]=Integer.parseInt(st.nextToken());
		}
		call(0,arr);
		System.out.println(ans);
	}
	
	// 모든 브루트포스 방식으로 모든 방법을 call하면서 경우의 수를 계산
	public static void call(int depth, int[][] arr) {
		if(depth==5)	// 최대 5번만 움직임
			return;
		int [][] brr = copy(arr);	// 각 배열마다 전에 있던 형태 그대로 찾아야 하기에, 계속해서 전의 배열 상태를 복사
		up(brr);	// 위로 올리는 동작
		call(depth+1, brr);	// 위로 올리는 동작 후 다시 call를 호출하여 상하좌우를 탐색
		brr = copy(arr);	// up 함수에서 brr이 바뀌었으므로 다시 brr에 arr의 값을 복사
		down(brr);	// 밑으로 내리는 동작
		call(depth+1, brr);
		brr = copy(arr);
		left(brr);
		call(depth+1, brr);
		brr = copy(arr);
		right(brr);
		call(depth+1, brr);
	}
	
	public static int[][] copy(int [][] arr){	// 매개변수로 들어오는 arr을 brr로 복사하여 brr을 반환
		int[][] brr = new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++)
				brr[i][j]=arr[i][j];
		}
		return brr;
	}
	
	public static void up(int [][]arr) {	// 올리는 동작
		for(int j=0;j<n;j++) {	// 위로 올리는 동작은 열을 고정하고 행을 먼저 증가
			int prev=0, prei=0;	// prev = 합쳐지는 값을 확인하기 위한 연속하는 값 확인, prei = prev의 위치 정보를 저장
			for(int i=0;i<n;i++)	// 행을 계속적으로 증가
				if(arr[i][j]!=0){	// 탐색하는 값이 0이 아니라면 합쳐질 수 있는 가능성이 있는 값임
					if(prev==arr[i][j]) {	// 이전에 나온 값과 동일한게 하나 더 나온다면 
						arr[prei][j]=0;	// 전에 있는 값은 0으로 만들고
						arr[i][j]*=2;	// 현재 위치의 값을 2배 올림
						prev=prei=0;	// 값이 변화했기에 전에 있는 값은 존재 하지 않음, 문제에서 동시에 두번이 합쳐질 수 없다고 명시됨
					}
					else {		// 현재값과 이전값이 다르면 새로운 값으로 업데이트
						prev=arr[i][j];
						prei=i;
					}
				}
			int pos=0;	// 공백을 없애기 위한 자리
			for(int i=0;i<n;i++) {
				if(arr[i][j]!=0) {	// 값이 0이 아니면 위로 붙여야 하기에 탐색
					ans=Math.max(ans, arr[i][j]);	// 만들 수 있는 최대 값을 저장 => 최종 정답이 될 값임
					int temp=arr[i][j];	// 현재 위치에 있는 값을 저장하고
					arr[i][j]=0;	// 현재 위치의 값을 0으로 삭제
					arr[pos++][j]=temp;	// 첫자리부터 값을 차곡차곡 저장한다.
				}
			}
		}
	}
	
	public static void down(int [][] arr) {
		for(int j=0;j<n;j++) {
			int prev=0, prei=0;
			for(int i=n-1;i>=0;i--)
				if(arr[i][j]!=0){
					if(prev==arr[i][j]) {
						arr[prei][j]=0;
						arr[i][j]*=2;
						prev=prei=0;
					}
					else {
						prev=arr[i][j];
						prei=i;
					}
				}
			int pos=n-1;
			for(int i=n-1;i>=0;i--) {
				if(arr[i][j]!=0) {
					ans=Math.max(ans, arr[i][j]);
					int temp=arr[i][j];
					arr[i][j]=0;
					arr[pos--][j]=temp;
				}
			}
		}
	}
	
	public static void left(int [][] arr) {
		for(int i=0;i<n;i++) {
			int prev=0, prej=0;
			for(int j=0;j<n;j++)
				if(arr[i][j]!=0){
					if(prev==arr[i][j]) {
						arr[i][prej]=0;
						arr[i][j]*=2;
						prev=prej=0;
					}
					else {
						prev=arr[i][j];
						prej=j;
					}
				}
			int pos=0;
			for(int j=0;j<n;j++) {
				if(arr[i][j]!=0) {
					ans=Math.max(ans, arr[i][j]);
					int temp=arr[i][j];
					arr[i][j]=0;
					arr[i][pos++]=temp;
				}
			}
		}
	}
	
	public static void right(int [][] arr) {
		for(int i=0;i<n;i++) {
			int prev=0, prej=0;
			for(int j=n-1;j>=0;j--)
				if(arr[i][j]!=0){
					if(prev==arr[i][j]) {
						arr[i][prej]=0;
						arr[i][j]*=2;
						
						prev=prej=0;
					}
					else {
						prev=arr[i][j];
						prej=j;
					}
				}
			int pos=n-1;
			for(int j=n-1;j>=0;j--) {
				if(arr[i][j]!=0) {
					ans=Math.max(ans, arr[i][j]);
					int temp=arr[i][j];
					arr[i][j]=0;
					arr[i][pos--]=temp;
				}
			}
		}
	}	
}
