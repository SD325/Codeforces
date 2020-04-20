import java.io.*;
import java.util.*;
public class CreatingTheContest {
	public static int n;
	public static int[] diff;
	public static int inRow(boolean[] valid) {
		int count = 0; 
		int max = 0; 
		for (int i = 0; i < n; i++) {
			if (!valid[i]) {
				max = Math.max(max, count);
				count = 0;
			} 
			else count++;
		}
		return max;
	}
	public static int binarySearch(int low, int high, int x) { 
		if (low > high) return -1; 
		if (x >= diff[high]) return high;
		int mid = (low+high)/2; 
		if (diff[mid] == x) return mid; 
		if (mid > 0 && diff[mid-1] <= x && x < diff[mid]) return mid-1;  
		//below mid
		if (x < diff[mid]) return binarySearch(low, mid - 1, x);
		//above mid
		return binarySearch(mid + 1, high, x); 
	} 
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		diff = new int[n];
		for (int i = 0; i < n; i++) {
			diff[i] = sc.nextInt();
			//System.out.println(diff[i]);
		}
		boolean[] valid = new boolean[n];
		for (int i = 0; i < n-1; i++) {
			if (diff[i+1] <= 2 * diff[i]) valid[i] = true;
		}
		System.out.println(inRow(valid) + 1);
		sc.close();
	}

}
