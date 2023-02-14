import java.awt.Window.Type;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt() * sc.nextInt() * sc.nextInt();
		String str = String.valueOf(num);
		int[] arr = new int[str.length()];
		int[] cnt = new int[10];
		
		for(int i = 0 ; i < arr.length;i++) {
			arr[i] = str.charAt(i) - '0';
		}
		for(int i = 0 ; i < arr.length;i++) {
			cnt[arr[i]]++;
		}
		
		for(int i = 0 ; i <cnt.length; i++) {
			System.out.println(cnt[i]);
		}
	}
}