import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int plus = 0;
		int cnt = 1;
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int n = 1;
		while(n<num) {
			plus += 6;
			cnt++;
			n = n+plus;
		}
		System.out.println(cnt);
	}
}