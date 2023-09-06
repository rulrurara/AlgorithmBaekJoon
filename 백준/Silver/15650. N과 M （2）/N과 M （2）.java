import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int N;
	static int M;
	static int[] result;
	static boolean[] visited;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		result = new int[M];
		visited = new boolean[N+1];
		start(1,0);
		
	}
	private static void start(int idx , int sidx) {
		if(sidx == M) {
			for (int i = 0; i < result.length; i++) {
				System.out.print(result[i] + " ");
			}
			System.out.println();
			return;
		}
		for (int i = idx; i <= N; i++) {
			if(!visited[i]) {
				result[sidx] = i;
				visited[i] = true;
				start(i , sidx+1);
				visited[i] = false;
			}
		}
		
	}
}