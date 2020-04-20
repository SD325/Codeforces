import java.util.*;
public class Yuhao_and_a_Parenthesis {
	static int n;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		ArrayList<Integer> pos = new ArrayList<>();
		ArrayList<Integer> neg = new ArrayList<>();
		int zero = 0;
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			String curr = sc.nextLine().trim();
			//check if curr is an impossible case
			int countOpen = (int) curr.chars().filter(num -> num == '(').count();
			int countClosed = (int) curr.chars().filter(num -> num == ')').count();
			int total = countOpen - countClosed;
			if (total > 0) {
				if (check(true, curr)) pos.add(total);
			}
			else if (total < 0) {
				if (check(false, curr)) neg.add(total);
			}
			else {
				if (isValid(curr)) zero++;
			}
		}
		int count = zero/2;
		for (Integer i : pos) {
			if (neg.contains(0-i)) {
				neg.remove(new Integer(0-i));
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}
	public static boolean check(boolean first, String s) {
		if (first) {
			int curr = 0;
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == '(') curr++;
				else curr--;
				if (curr < 0) return false;
			}
		}
		else {
			int curr = 0;
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == ')') curr++;
				else curr--;
				if (curr < 0) return false;
			}
		}
		return true;
	}
	public static boolean isValid(String s) {
		char arr[] = s.toCharArray();
		Stack<Character> set = new Stack();
		for (Character ch : arr) {
			if (ch == '{' || ch == '[' || ch == '(') {
				set.push(ch);
			} else if (ch == ']') {
				if (set.isEmpty() || set.peek() != '[') {
					return false;
				} 
				set.pop();
			} else if (ch == ')') {
				if (set.isEmpty() ||  set.peek() != '(') 
					return false;
				set.pop();	
			} else if (ch == '}') {
				if (set.isEmpty() ||  set.peek() != '{') 
					return false;
				set.pop();	
			}
		}
		return set.size() == 0;
	}
}
