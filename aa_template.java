import java.util.*;
public class aa_template {
	static int n;
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		n = sc.nextInt();
//		sc.close();
		ArrayList<Integer> a = new ArrayList<Integer>();
		for (int i = 1; i <= 250; i++) a.add(i);
		int[] b = new int[225-50+1];
		for (int i = 50; i <= 225; i++) b[i-50] = i;
		ArrayList<Integer> b_prime = new ArrayList<Integer>(b);
		a.removeAll(Arrays.asList(b));
		System.out.println(a);
	}

}
