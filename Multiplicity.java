import java.util.*;
public class Multiplicity {
	static int n;
	static int[] a;
	static int count;
	public static void dfs(int ind, ArrayList<Integer> curr) {
		if (ind >= n) return;
		for (int i = ind+1; i < n; i++) {
			curr.add(a[i]);
			if (a[i] % curr.size() == 0) {
				dfs(i, curr);
				count++;
			}
			curr.remove(curr.size()-1);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		a = new int[n];
		for (int i = 0; i < n; i++) a[i] = sc.nextInt();
		count = 0;
		for (int i = 0; i < n; i++) {
			ArrayList<Integer> temp = new ArrayList<Integer>();
			temp.add(a[i]);
			count++;
			dfs(i, temp);
		}
		System.out.println(count % (7 + 10*10*10*10*10*10*10*10*10));
		sc.close();

	}

}
