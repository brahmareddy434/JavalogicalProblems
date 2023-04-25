package p1;

/*
 You are given an m x n binary matrix grid.

A move consists of choosing any row or column and toggling each value in that row or column (i.e., changing all 0's to 1's, and all 1's to 0's).

Every row of the matrix is interpreted as a binary number, and the score of the matrix is the sum of these numbers.

Return the highest possible score after making any number of moves (including zero moves).

 

Example 1:


Input: grid = [[0,0,1,1],[1,0,1,0],[1,1,0,0]]
Output: 39
Explanation: 0b1111 + 0b1001 + 0b1111 = 15 + 9 + 15 = 39
Example 2:

Input: grid = [[0]]
Output: 1
 

Constraints:

m == grid.length
n == grid[i].length
1 <= m, n <= 20
grid[i][j] is either 0 or 1.



 */
public class task24042023 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = {{0,0,1,1},{1,0,1,0},{1,1,0,0}};
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < 1; j++) {
				if (a[i][j] == 0) {
					for (int k = 0; k < a[i].length; k++) {
						if (a[i][k] == 0)
							a[i][k] = 1;
						else
							a[i][k] = 0;
					} // inner horizontal change foor loop end
				}
			} // inner check for loop end
		} // outer for loop end
		if(a.length>1) {
		for (int i = 1; i < a.length + 1; i++) {
			int co = 0, cou = 0;
			for (int j = 0; j < a.length; j++) {
				if (a[j][i] == 0)
					co++;// if 0
				else
					cou++;// if 1
			} // inner one for loop
			if (co > cou) {
				for (int j = 0; j < a.length; j++) {
					if (a[j][i] == 1) {
						a[j][i] = 0;
					} else
						a[j][i] = 1;
				}
			} // if 0 count is high
		} // outer for loop end vertical
		}//check array length
		for (int i = 0; i < a.length; i++) {
			int temp = 0, r = 0;
			for (int j = 0; j < a[i].length; j++) {
				temp = (int) Math.pow(2, r) * a[i][j] + temp;
				r = r + 1;
			}
			sum = sum + temp;
		} // for loop end add final
		System.out.println(sum);
	}

}
