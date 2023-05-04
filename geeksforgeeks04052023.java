package p1;

public class geeksforgeeks04052023 {
	public static int maxCoins(int ranges[][]) {
		int ans = 0;
		for (int i = 0; i < ranges.length; i++) {
			int end = ranges[i][1];
			for (int j = 0; j < ranges.length; j++) {
				if (j != i) {
					if (ranges[j][0] >= end) {
						int temp = ranges[i][2] + ranges[j][2];
						if (temp > ans) {
							ans = temp;
						} // inner if loop
					} // outer if loop
				}
			} // inner for loop
			if (ranges[i][2] > ans)
				ans = ranges[i][2];
		} // outer for loop

		return ans;
	}

	public static void main(String[] args) {

		int[][] a = { { 1, 2, 3 }, { 1, 2, 6 }, { 2, 3, 7 } };// TODO Auto-generated method stub
		int ans = geeksforgeeks04052023.maxCoins(a);
		System.out.println(ans);

	}

}
