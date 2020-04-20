import java.util.*;
public class New_Year_and_the_Treasure_Geolocation {
	static int n;
	static int[][] ab;
	static int[][] xy;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		xy = new int[n][2];
		ab = new int[n][2];
		int[] temp = new int[n];
		for (int i = 0; i < n; i++) {
			xy[i][0] = sc.nextInt();
			xy[i][1] = sc.nextInt();
			temp[i] = i;
		}
		for (int i = 0; i < n; i++) {
			ab[i][0] = sc.nextInt();
			ab[i][1] = sc.nextInt();
		}
		heapPermutation(temp, n, n);
 		sc.close();
	}
	public static void heapPermutation(int a[], int size, int n) 
	{ 
		// if size becomes 1 then prints the obtained 
		// permutation 
		if (size == 1) 
			check(a,n); 

		for (int i=0; i<size; i++) 
		{ 
			heapPermutation(a, size-1, n); 

			// if size is odd, swap first and last 
			// element 
			if (size % 2 == 1) 
			{ 
				int temp = a[0]; 
				a[0] = a[size-1]; 
				a[size-1] = temp; 
			} 

			// If size is even, swap ith and last 
			// element 
			else
			{ 
				int temp = a[i]; 
				a[i] = a[size-1]; 
				a[size-1] = temp; 
			} 
		} 
	}
	public static void check(int[] a, int n) {
		int valX = -1;
		int valY = -1;
		for (int i = 0; i < a.length; i++) {
			if (i == 0) {
				//System.out.println(a[i] + ": " + xy[a[i]][0] + " " +  xy[a[i]][1]);
				//System.out.println("\t" + ab[a[i]][0] + " " +  ab[a[i]][1]);
				valX = xy[a[i]][0] + ab[i][0];
				valY = xy[a[i]][1] + ab[i][1];
				continue;
			}
			int cX = xy[a[i]][0] + ab[i][0];
			int cY = xy[a[i]][1] + ab[i][1];
			if (valX != cX || valY != cY) return;
		}
		System.out.println(valX + " " + valY);
	}
}
