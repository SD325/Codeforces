import java.util.*;
public class Sum_in_the_tree {
	static int n;
	static int[] p;
	static int[] s;
	static boolean[] visited;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		p = new int[n];
		s = new int[n];
		for (int i = 1; i < n; i++) p[i] = sc.nextInt() - 1;
		for (int i = 0; i < n; i++) s[i] = sc.nextInt();
		visited = new boolean[n];
		int sum = s[0];
		for (int i = 1; i < n; i++) {
			int x = recurse(i, 0);
			if (x == -1) {
				System.out.println(-1);
				sc.close();
				return;
			}
			else sum += x;
		}
		System.out.println(sum);
		sc.close();
	}
	public static int recurse(int x, int sum) {
		if (x == 0) return 0;
		if (visited[x]) return 0;
		visited[x] = true;
		if (s[x] == -1) return recurse(p[x], sum);
		else if (s[x] > sum) return -1;
		else return recurse(p[x], sum +  s[x]);
	}

}
