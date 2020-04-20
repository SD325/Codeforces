import java.util.*;
public class NN_and_the_Optical_Illusion {
	static int n;
	static double r;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		r = sc.nextDouble();
		double theta = 360.0 / (double) n;
		//System.out.println(theta);
		double cos = Math.cos(Math.toRadians(theta));
		double p1 = Math.sqrt(2)*Math.sqrt(-1*r*r*(cos - 1));
		double p2 = r*(-cos)+r;
		double p3 = cos+1;
		double R = (p1+p2)/p3;
		System.out.println(R);
		sc.close();
	}

}
