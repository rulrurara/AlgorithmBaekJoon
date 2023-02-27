import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[9];
		for(int i = 0 ; i< 9 ; i++) {
			arr[i] = sc.nextInt();
		}
		int sum =0;
		for(int i = 0 ; i<arr.length;i++) {
			sum += arr[i];
		}
		Arrays.sort(arr);
		int idx1 = 0;
		int idx2= 0;
		for(int i = 0 ; i < 8 ; i++) {
			for(int j = i+1 ; j<9;j++) {
				if((sum - (arr[i]+arr[j])) ==100) {
					idx1 = i;
					idx2 = j;
				}
			}
		}
		for(int i = 0 ; i<arr.length;i++) {
			if(i != idx1 && i !=idx2) {
				System.out.println(arr[i]);
			}
		}
		
	}
}