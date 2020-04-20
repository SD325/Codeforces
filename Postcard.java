import java.util.*;
public class Postcard {
	static String in;
	static int k;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		in = sc.next();
		k = sc.nextInt();
		int scount = 0;
		int ccount = 0;
		String letters = "";
		for (int i = 0; i < in.length(); i++) {
			if (in.charAt(i) == '*') scount++;
			else if (in.charAt(i) == '?') ccount++;
			else letters += "" + in.charAt(i);
		}
		int total = scount + ccount;
		if (letters.length() == k) System.out.println(letters);
		else if (letters.length() > k) {
			if (total >= letters.length() - k) {
				//print example
				//System.out.println("print example 1");
				int curr = letters.length() - k;
				int ind = 1;
				String sol = "";
				while (curr > 0) {
					if (in.charAt(ind) != '?' && in.charAt(ind) != '*') sol += in.charAt(ind-1); 
					else {
						curr--;
						ind++;
					}
					ind++;
				}
				ind--;
				while (ind < in.length()) {
					if (in.charAt(ind) != '?' && in.charAt(ind) != '*') sol += in.charAt(ind);
					ind++;
				}
				System.out.println(sol);
			}
			else System.out.println("Impossible");
		}
		else {
			if (scount > 0) {
				//print example
				//System.out.println("print example 2");
				int index = in.indexOf("*");
				String before = in.substring(index-1, index);
				int ind = 0;
				String sol = "";
				while (ind < index) {
					if (in.charAt(ind) != '?' && in.charAt(ind) != '*') sol += in.charAt(ind);
					ind++;
				}
				for (int i = 0; i < k-letters.length(); i++) sol += before;
				while (ind < in.length()) {
					if (in.charAt(ind) != '?' && in.charAt(ind) != '*') sol += in.charAt(ind);
					ind++;
				}
				System.out.println(sol);
			}
			else System.out.println("Impossible");
		}
		sc.close();
	}

}
