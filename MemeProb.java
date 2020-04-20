import java.util.*;
public class MemeProb {
	static int t;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		int d = 0;
		for (int i = 0; i < t; i++) {
			d = sc.nextInt();
			double discriminant = d*d - 4*d;
			if (discriminant < 0) System.out.println("N");
			else {
				double[] roots = getRoots(d, discriminant);
				double a = 0.0;
				if (roots[0] < 0.0 && roots[1] < 0.0) System.out.println("N");
				else if (roots[0] >= 0.0) a = roots[0];
				else a = roots[1]; // roots[1] >= 0.0
				double b = (double) d - a;
				System.out.println("Y " + a + " " + b);
				
			}
		}
		
		sc.close();
	}
	public static double[] getRoots(int d, double discrim) {
		double root1 = ((double) d + Math.sqrt(discrim)) / 2.0;
		double root2 = ((double) d - Math.sqrt(discrim)) / 2.0;
		return new double[] {root1, root2};
	}

}
