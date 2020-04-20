import java.util.*;
import java.io.*;
public class ValidBFS {
	public static int n;
	public static HashMap<Integer, ArrayList<Integer>> nodes;
	public static int[] query;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		nodes = new HashMap<Integer, ArrayList<Integer>>();
		for (int i = 0; i < n-1; i++) {
			int key = sc.nextInt();
			int value = sc.nextInt();
			if (!nodes.containsKey(key)) {
				ArrayList<Integer> temp = new ArrayList<Integer>();
				temp.add(value);
				nodes.put(key, temp);
			}
			else {
				ArrayList<Integer> temp = nodes.get(key);
				temp.add(value);
				nodes.put(key, temp);
			}
		}
		query = new int[n];
		for (int i = 0; i < n; i++) {
			query[i] = sc.nextInt();
		}
		int[] level = new int[n+1];
		bfs(1, level);
		if (valid(level)) System.out.println("Yes");
		else System.out.println("No");
		sc.close();
	}
	public static boolean valid(int[] level) {
		HashMap<Integer, Integer> levelMap = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> numPerLevel = new HashMap<Integer, Integer>();
		int max_val = Integer.MIN_VALUE; // max level
		for (int i = 0; i < n; i++) {
			int key = query[i];
			int value = level[key];
			max_val = Math.max(max_val, value);
			levelMap.put(key, value);
			if (numPerLevel.containsKey(value)) numPerLevel.put(value, numPerLevel.get(value)+1);
			else numPerLevel.put(value, 1);
		}
//		System.out.println(levelMap);
//		System.out.println(numPerLevel);
		int[] numOccur = new int[max_val + 1]; // index is level number
		numOccur[0] = 1;
		for (int i = 1; i < query.length; i++) {
			int currlevel = levelMap.get(query[i]);
			if (numPerLevel.get(currlevel - 1) > numOccur[currlevel - 1]) return false;
			numOccur[currlevel]++;
		}
		return true;
	}
	public static void bfs(Integer a, int[] level) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(a);
		boolean[] isVisited = new boolean[n+1];
		while (!queue.isEmpty()) {
			Integer x = queue.poll();
			isVisited[x] = true;
			if (!nodes.containsKey(x)) continue;
			for (Integer i : nodes.get(x)) {
				if (!isVisited[i]) {
					queue.add(i);
					level[i] = level[x] + 1;
				}
			}
		}
	}
}
