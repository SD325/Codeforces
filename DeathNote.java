import java.util.*;
import java.io.*;
public class DeathNote {
	public static int n; //number of days you will write names
	public static int m; //number of names which can be written on each page
	public static int[] a; //number of names you will write in the notebook during the i-th day
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);                                              
		n = sc.nextInt();
		m = sc.nextInt();
		a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int[] sums = new int[n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				sums[i] += a[j];
			}
		}
		//for (int i : sums) System.out.print(i + " ");
		//System.out.println();
		int[] pageturns = new int[n];
		for (int i = 0; i < n; i++) {
			int num = sums[i];
			if (i == 0) pageturns[0] = num/m;
			else pageturns[i] = (num/m) - pageturns[i-1];
		}
		for (int i : pageturns) System.out.print(i + " ");
	}

}
