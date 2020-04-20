import java.util.*;
public class Snowball {
	static int h, w;
	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		w = sc.nextInt();
		h = sc.nextInt();
		int u1 = sc.nextInt();
		int d1 = sc.nextInt();
		int u2 = sc.nextInt();
		int d2 = sc.nextInt();
		for (int i = h; i >= 0; i--) {
			if (i == d1) w-=u1;
			else if (i == d2) w-=u2;
			w+=i;
			if (w < 0) w = 0;
		}
		System.out.println(w);
		sc.close();
	}

}
