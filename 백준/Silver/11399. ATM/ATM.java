import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < arr.length; i++) {
			arr[i] =sc.nextInt();
		}
		Arrays.sort(arr);
		int sum = 0;
		int temp =0;
		for (int i = 0; i < arr.length; i++) {
			temp += arr[i];
			sum += temp;
		}
		System.out.println(sum);
	}
}