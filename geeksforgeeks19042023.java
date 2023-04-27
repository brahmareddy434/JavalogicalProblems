package p1;
/*
 * There are N rooms in a straight line in Geekland State University's hostel, you are given a binary string S of length N where S[i] = '1' represents that there is a wifi in ith room or S[i] = '0' represents no wifi. Each wifi has range X i.e. if there is a wifi in ith room then its range will go upto X more rooms on its left as well as right. You have to find whether students in all rooms can use wifi.

Example 1: 

Input:
N = 3, X = 0
S = "010"
Output:
0
Explanation: 
Since the range(X)=0, So Wifi is only 
accessible in second room while 1st & 3rd
room have no wifi.
Example 2: 

Input:
N = 5, X = 1
S = "10010"
Output:
1
Explanation: 
Index 0 : Wifi is available
Index 1 : Since range of 0th Index is 1
          so, here wifi will be available.
Index 2 : Since range of 3rd Index is 1
          so, here also wifi available.
Index 3 : Wifi is available
Index 4 : here range of 3rd Index is available.
So all the rooms have wifi, so return true.
Your Task:
You don't need to read input or print anything. Your task is to complete the function wifiRange( ) which takes integer N, string S and integer X as input parameters and returns true if students in all rooms can use wifi or false otherwise.

Expected Time Complexity:O(N)
Expected Space Complexity:O(1)

Constraints:
1 ≤ N ≤ 106
0 ≤ X ≤ 106
 */

public class geeksforgeeks19042023 {
	public static void main(String[] args) {
		StringBuffer s = new StringBuffer("000010000000001");
		int n = s.length(), r = 2, count = 0;
		if (r > n)
			r = n;
		for (int i = 0; i < n; i++) {

			if (s.charAt(i) == '1') {
				int bf = i - r, af = i + r;
				if (bf < 0)
					bf = 0;
				if (af > n - 1)
					af = n - 1;
				for (int j = bf; j < i; j++) {
					s.replace(j, j + 1, "1");
				}
				for (int j = i+1; j < af+1; j++) {
					if (j > s.length() - 1)
						break;
					else
						s.replace(j, j + 1, "1");

				}
				i = i + r+1;
			}
		} // for loop
		System.out.println(s);

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '1')
				count++;
		}
		if (count == n || (r >= n && count > 0)) {
			System.out.println(1);
		} else
			System.out.println(0);
	}

}
