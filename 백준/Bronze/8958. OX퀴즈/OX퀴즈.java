import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int t = 0 ; t < T ; t++) {
			String str = sc.next();
			char[] cha = str.toCharArray();
			int cnt = 0;
			int result = 0;
			for(int i = 0 ; i < cha.length;i++) {
				if(cha[i]=='O') {
					cnt++;
					result += cnt;
				}else {
					cnt = 0;
				}
			}
			System.out.println(result);
		}
	}
}