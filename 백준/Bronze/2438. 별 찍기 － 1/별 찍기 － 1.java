import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int cnt = 1;
		for(int i = 0; i <num; i++) {
			for(int j = 0 ; j<cnt ; j++) {
				System.out.print("*");
			}System.out.println();
			cnt++;
			
		}
	}
}