package p1;

import java.util.ArrayList;

public class task18042023 {
	public static void main(String[] args) {
		int n = 3, k = 5, r = 0, i = 0;
		ArrayList al = new ArrayList();
		for (int j = 1; j <= n; j++) {
			al.add(j);
		}
		while (al.size() != 1) {
			r = i + k;
			int len = al.size();
			if (r > al.size()) {
				r = r % len;
				if(r==0)
					r=al.size();
			}
			al.remove(r - 1);
			i = r - 1;
		}
		System.out.println(al);
	}
}
