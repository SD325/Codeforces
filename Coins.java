import java.util.*;
public class Coins {
	static int n;
	static int sum;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sum = sc.nextInt();
		if (sum % n != 0) System.out.println(sum/n + 1);
		else System.out.println(sum/n);
		sc.close();

	}

}
