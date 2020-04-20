import java.util.*;
public class Gennady_and_a_Card_Game {
	static String card;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		card = sc.next();
		sc.nextLine();
		String[] cards = sc.nextLine().split(" ");
		for (String s : cards) {
			String c = s.trim();
			if (c.substring(0, 1).equals(card.substring(0, 1)) || c.substring(1, 2).equals(card.substring(1, 2))) {
				System.out.println("YES");
				sc.close();
				return;
			}
		}
		System.out.println("NO");
		sc.close();
	}

}