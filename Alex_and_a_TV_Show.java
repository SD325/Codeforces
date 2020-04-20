import java.util.*;
public class Alex_and_a_TV_Show {
	static int n, q;
	static String sol;
	static ArrayList<ArrayList<Integer>> multi;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		q = sc.nextInt();
		sol = "";
		multi = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < n; i++) { 
            multi.add(new ArrayList<Integer>()); 
        } 
		sc.nextLine();
		for (int i = 0; i < q; i++) {
			String[] in = sc.nextLine().split(" ");
			int op = Integer.parseInt(in[0]);
			if (op == 1) {
				int ind = Integer.parseInt(in[1]) - 1;
				ArrayList<Integer> temp = new ArrayList<>();
				temp.add(Integer.parseInt(in[2]));
				multi.set(ind, temp);
			}
			if (op == 2) {
				int ind = Integer.parseInt(in[1]) - 1;
				int indY = Integer.parseInt(in[2]) - 1;
				int indZ = Integer.parseInt(in[3]) - 1;
				op2(ind, indY, indZ);
			}
			if (op == 3) {
				int ind = Integer.parseInt(in[1]) - 1;
				int indY = Integer.parseInt(in[2]) - 1;
				int indZ = Integer.parseInt(in[3]) - 1;
				op3(ind, indY, indZ);
			}
			if (op == 4) {
				int ind = Integer.parseInt(in[1]) - 1;
				int v = Integer.parseInt(in[2]);
				int count = Collections.frequency(multi.get(ind), v);
				sol += "" + (count%2);
			}
		}
		System.out.println(sol);
		sc.close();
	}
	public static void op2(int indx, int indy, int indz) {
		HashSet<Integer> hs = new HashSet<Integer>();
		for (Integer i : multi.get(indy)) {
			hs.add(i);
		}
		for (Integer i : multi.get(indz)) {
			hs.add(i);
		}
		multi.set(indx, new ArrayList<Integer>(hs));
	}
	public static void op3(int indx, int indy, int indz) {
		ArrayList<Integer> y = multi.get(indy);
		ArrayList<Integer> z = multi.get(indz);
		ArrayList<Integer> x = new ArrayList<Integer>();
		for (Integer iy : y) {
			for (Integer iz : z) {
				x.add(gcd(iy, iz));
			}
		}
		multi.set(indx, x);
	}
	public static int gcd(int a, int b) { 
      if (b == 0) return a; 
      return gcd(b, a % b);  
    }
}
