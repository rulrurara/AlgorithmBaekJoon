import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean a = true;
		outer: while(a) {
			boolean b = true;
			String str = sc.next();
			if(str.equals("0")) {
				a = false;
				break outer;				
			}
			int rt = str.length()-1;
			int lt = 0;
			for(int i = 0 ; i <str.length()/2;i++) {
				if(str.charAt(rt) == str.charAt(lt)) {
					rt--;
					lt++;
				}else {
					b = false;
					break;
				}
			}
			if( b == true) {
				System.out.println("yes");
			}else {
				System.out.println("no");
			}
			
		}
	}
}