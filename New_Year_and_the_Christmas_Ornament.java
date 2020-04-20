import java.util.*;
public class New_Year_and_the_Christmas_Ornament {
	static int y, b, r;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		y = sc.nextInt();
		b = sc.nextInt();
		r = sc.nextInt();
		int[] ys = new int[]{y, y+1, y+2};
		int[] bs = new int[]{b-1, b, b+1};
		int[] rs = new int[]{r-2, r-1, r};
		int ty = 0;
		int tb = 0;
		int tr = 0;
		if (check(ys)) ty = ys[0] + ys[1] + ys[2];
		if (check(bs)) tb = bs[0] + bs[1] + bs[2];
		if (check(rs)) tr = rs[0] + rs[1] + rs[2];
		System.out.println(Math.max(ty, Math.max(tr, tb)));
		sc.close();
	}
	public static boolean check(int[] t) {
		if (t[0] > y || t[1] > b || t[2] > r) return false;
		return true;
	}
}
