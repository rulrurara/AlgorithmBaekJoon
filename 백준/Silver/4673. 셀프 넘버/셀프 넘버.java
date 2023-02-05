import java.util.ArrayList;
import java.util.List;


public class Main {
	public static void main(String[] args) {
		//list에 있는 것은 생성자를 갖는 숫자들의 집합
		// 1~10000까지 list와 비교하여 list에 없는 값들은 출력하기
		//
		int a = 0;
		int result=0;
		boolean bol = false;
		List<Integer> list = new ArrayList<>();
		for(int i = 1 ; i <= 10000; i++) {
			a++;
			list.add(a + a%10 + (a/10)%10 + 
					(a/100)%10 +(a/1000)%10 +(a/10000)%10);
		}
		for(int j = 1 ; j <= 10000 ; j++) {
			bol=false;
			for(int i = 0 ; i <list.size() ; i++) {
				if(list.get(i) == j) {
					bol = true;
				}
			}
			if(bol==false) {
				System.out.println(j);
			}
		}
	}
}