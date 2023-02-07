import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M =sc.nextInt();
		int a = 0;
		int cnt = 0;
		boolean re = true;
		List<Integer> list = new ArrayList<>();
		for(int i = 1 ; i <= 1000000; i++) {
			a++;
			list.add(a + a%10 + (a/10)%10 + 
					(a/100)%10 +(a/1000)%10 +(a/10000)%10 +(a/100000)%10 +(a/1000000)%10);
		}
		for(int i = 0 ; i< list.size(); i++) {
			cnt++;
			if(list.get(i) == M) {
				System.out.println(cnt);
				re =false;
				break;
			}
		}
		if(re==true) {
			System.out.println(0);
		}
	}
}