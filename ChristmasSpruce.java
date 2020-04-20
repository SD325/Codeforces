import java.util.*;
public class ChristmasSpruce {
	static int n;
	static int[] parent, deg;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		parent = new int[n];
		deg = new int[n];
		for (int i = 1; i < n; i++) {
			parent[i] = sc.nextInt()-1;
			deg[parent[i]]++;
		}
		int[] leaves = new int[n];
		for (int i = 0; i < n; i++)
			if (deg[i] == 0) leaves[parent[i]]++;
		for (int i = 0; i < n; i++) {
			if (deg[i] > 0 && leaves[i] < 3) {
				System.out.println("No");
				sc.close();
				return;
			}
		}
		System.out.println("Yes");
		sc.close();
	}

}
