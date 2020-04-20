import java.util.*;
import java.io.*;
public class WalkingBetweenHouses {
	public static int n;
	public static int k;
	public static int s;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt(); // number of **houses**
		k = sc.nextInt(); // number of **moves**
		s = sc.nextInt(); // total **distance**

		int max = (n-1) * k;
		if (max < s) {
			System.out.println("NO");
			return;
		}
		if (s < k) {
			System.out.println("NO");
			return;
		}
		ArrayList<Integer> diff = new ArrayList<Integer>();
		
		int curr_distance = s;
		int distancePerMove = s / k;
		int rem = s % k;
		if (s/k > n-1) {
			distancePerMove = n-1;
			rem = s % (n-1);
		}
		for (int i = 0; i < k; i++)	diff.add(distancePerMove);
		diff.add(rem);
		System.out.println(diff);
		System.out.println("YES");
		
		sc.close();
	}

}
