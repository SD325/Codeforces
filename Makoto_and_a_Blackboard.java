import java.util.*;
public class Makoto_and_a_Blackboard {
	static int n, k;
	static ArrayList<Integer> divs;
	static HashMap<Integer, Double> probs;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		k = sc.nextInt();
		HashMap<Integer, Double> probs = new HashMap<>();
		for (int i = 1; i <= n/2 + 1; i++) {
			if (n % i == 0) probs.put(i, 0.0);
		}
		sc.close();
	}
}
