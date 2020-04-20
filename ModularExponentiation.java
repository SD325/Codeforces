import java.util.*;
public class ModularExponentiation {
	static int n, m;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		int val = m % (int) Math.pow(2, n);
		System.out.println(val);
		sc.close();
	}
}
