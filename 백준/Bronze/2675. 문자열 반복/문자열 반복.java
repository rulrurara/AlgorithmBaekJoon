import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int i = 0 ; i <T ; i++) {
			int R = sc.nextInt();
			String str = sc.next();
			String result ="";
			for(int j = 0 ; j<str.length();j++) {
				for(int k = 0 ; k<R ; k++) {
					result += str.charAt(j); 
				}
				
			}
		System.out.println(result);
		}
		
	}
}