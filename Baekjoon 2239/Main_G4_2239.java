package gold;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_G4_2239 {
	static int[][] map;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		map = new int[9][9];// , temp = new int[9][9];
		for (int i = 0; i < 9; i++) {
			String str = br.readLine();
			for (int j = 0; j < 9; j++)
				map[i][j] = str.charAt(j) - '0';
		}

		sudoku(0, 0);

		System.out.println("결과");
	}

	private static void sudoku(int row, int col) throws Exception {

		if (col == 9) {
			sudoku(row + 1, 0);
			return;
		}
		if (row == 9) {
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++)
					bw.write(map[i][j] + '0');
				bw.write("\n");
			}
			bw.close();
			System.exit(0);
		}

		// row 먼저 증가, row가 끝까지 올라가면 col증가
		if (map[row][col] == 0) {
			for (int i = 1; i <= 9; i++) {
				if (check(row, col, i)) {
					map[row][col] = i;
					sudoku(row, col + 1);
				}
			}
			map[row][col] = 0;
			return;
		}
		sudoku(row, col + 1);
	}

	private static boolean check(int row, int col, int val) {
		// 가로체크
		for (int j = 0; j < 9; j++)
			if (map[row][j] == val)
				return false;

		// 세로체크
		for (int i = 0; i < 9; i++)
			if (map[i][col] == val)
				return false;

		// 부분체크
		for (int i = (row / 3) * 3; i < ((row / 3) * 3) + 3; i++) {
			for (int j = (col / 3) * 3; j < ((col / 3) * 3) + 3; j++) {
				if (map[i][j] == val)
					return false;
			}
		}
		// 모든 검사 완료시 가능한 조합임
		return true;
	}
}
