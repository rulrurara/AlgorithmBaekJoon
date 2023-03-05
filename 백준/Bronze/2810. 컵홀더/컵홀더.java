import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String str = sc.next();
		char[] arr = new char[N];
		arr = str.toCharArray();
		int cnt = 0;
		int cup = 0;

		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == 'S') {
				cnt++;
				cup++;
				
			}else if(arr[i] == 'L') {
				i += 1;
				cnt+=2;
				cup++;
			}
		}
		cup +=1;
		if(cnt <= cup) {
			System.out.println(cnt);
		}
		else if(cnt > cup) {
			System.out.println(cup);
		}
	}
}