package silver;

import java.util.Arrays;
import java.util.Scanner;

public class Main_S5_10610 {
	static int [] nums=new int[10]; 
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char nums[] =sc.nextLine().toCharArray();	// 입력받는 숫자를 char로 받아서 정렬 
		Arrays.sort(nums);
		int chk=0;
		for(int i=nums.length-1;i>=0;i--) {	// 오름차순으로 정렬되었기에 마지막 배열부터 값을 계산
			chk+=nums[i]-'0';
			sb.append(nums[i]);
		}
		// 30의 배수는 3의 배수이면서 10의 배수여야 하기에 다 더한값이 3의 배수이면서 0이 최소한 하나는 있어야함
		if(chk%3!=0 || nums[0]!='0') {
			sb.setLength(0);	// sb의 내용의 길이를 0으로 만들어 출력 값을 초기화
			sb.append(-1);	// 30의 배수가 아니면 -1을 출력함
		}
		System.out.println(sb.toString());
		sc.close();
	}
}
