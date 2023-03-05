import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		for (int i = 0; i <10; i++) {
			arr[i] = sc.nextInt();
		}
		int cnt = 0;
		int min = 100;
		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			cnt += arr[i];
			if(Math.abs(cnt - 100) <=min) {
				min = Math.abs(cnt - 100);
				result = cnt;
			}
		}
		System.out.println(result);
	}
}