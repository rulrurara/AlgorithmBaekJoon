import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	int[] music = new int[8]; // 크기가 8인 배열 선언
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<music.length; i++) {
			music[i] = sc.nextInt(); //숫자 8개 찍기
		}

		
		String res= "";
		for(int i=0; i<music.length-1; i++) {
			if(music[i]==music[i+1]-1) {
				res = "ascending";
			}else if(music[i]==music[i+1]+1) {
				res = "descending";
			}else {
				res = "mixed";
				break;
			}
		}
		System.out.println(res);
		
		
		
	}
}