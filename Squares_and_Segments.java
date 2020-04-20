import java.util.*;
public class Squares_and_Segments {
	static int n;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		//int min = Integer.MAX_VALUE;
		int floor_square = 0;
		while (floor_square * floor_square <= n) floor_square++;
		floor_square--;
		//System.out.println(floor_square);
		int x = floor_square;
		int y = floor_square;
		int mod = 0;
		n -= floor_square*floor_square;
		while (n > 0) {
			n -= floor_square;
			if (mod % 2 == 0) x++;
			else y++;
		}
		System.out.println((x+y));
		sc.close();

	}
	

}
