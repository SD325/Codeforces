import java.util.*;
public class Roman_and_Browser {
	static int n, k;
	static boolean[] test;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		k = sc.nextInt();
		test = new boolean[n];
		int totalTest = 0;
		int totalSocial = 0;
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			if (x == -1) {test[i] = false; totalSocial++;}
			else {test[i] = true; totalTest++;}
		}
		ArrayList<Integer> vals = new ArrayList<Integer>();
		for (int b = 0; b < k; b++) {
			int testC = totalTest;
			int socialC = totalSocial;
			for (int i = 0; b+i*k < n; i++) {
				int ind = b+i*k;
				if (test[ind]) testC--;
				else socialC--;
			}
			vals.add(Math.abs(testC - socialC));
		}
		System.out.println(Collections.max(vals));
		sc.close();
	}

}
