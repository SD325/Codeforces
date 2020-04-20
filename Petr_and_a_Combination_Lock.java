import java.util.*;
public class Petr_and_a_Combination_Lock {
	static int n;
	static int[] nums;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		nums = new int[n];
		for (int i = 0; i < n; i++) nums[i] = sc.nextInt();
		int max = (int) Math.pow(2, n);
		for (int i = 0; i < max; i++) {
			if (generate(i)) {
				System.out.println("YES");
				sc.close();
				return;
			}
		}
		System.out.println("NO");
		sc.close();
	}
	public static boolean generate(int x) {
		String bin = Integer.toBinaryString(x);
		while (bin.length() < n) bin = "0" + bin;
		boolean[] on = new boolean[n];
		int ind = 0;
		for (char c : bin.toCharArray()) {
			if (c == '1') on[ind] = true;
			ind++;
		}
		if (check(on)) return true;
		return false;
	}
	public static boolean check(boolean[] on) {
		int sum = 0;
		for (int i = 0; i < n; i++) {
			boolean b = on[i];
			if (b) sum += nums[i];
			else sum -= nums[i];
		}
		return sum % 360 == 0;
	}
}
