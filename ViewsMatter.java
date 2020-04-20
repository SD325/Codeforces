import java.util.*;
public class ViewsMatter {
	static int n; //num stacks
	static int m; //height of exhibit
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		int[] row = new int[n];
		int[] col = new int[m];
		int top = 0;
		int front = Integer.MIN_VALUE; //max height of stack
		int sum = 0;
		for (int i = 0; i < n; i++) {
			row[i] = sc.nextInt();
			for (int j = 0; j < row[i]; j++) col[j]++;
			top++;
			front = Math.max(front, row[i]);
			sum += row[i];
		}
		int count1 = 0;
		for (int c = 0; c < m; c++) {
			for (int r = 0; r < n; r++) {
				int x = Math.min(col[c], row[r]);
				if (x > 1) {
					count1++;
					col[c]--;
					row[r]--;
				}
			}
		}
		int count2 = sum - Math.max(top, front);
		if (count1 != 1) System.out.println(count2);
		else System.out.println(count1);
		sc.close();
	}

}
