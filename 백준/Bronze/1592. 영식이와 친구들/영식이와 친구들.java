import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // n번자리
		int M = sc.nextInt(); // m번이하 받음
		int L = sc.nextInt(); // 받은게 짝수면 자기 위치에서 반시계 l번
		
		int[] arr = new int[N];
		int[] count = new int[N];
		int cnt = 0;
		count[0] = 1;
		int idx = 0;
		while(true) {
			//1번부터 공던짐 받은애가 홀수면 +L 짝수면 -L
			if(count[idx] == M) {
				break;
			}
			
			if(count[idx]%2 ==0) {
				if(idx-L >=0) {
					idx -=L;
					count[idx]++;
					
				}else {
					idx = idx - L + N;
							count[idx]++;
				}
				cnt++;
			}
			if(count[idx] == M) {
				break;
			}
			if(count[idx]%2 ==1) {
				if(idx+L < N) {
					idx +=L;
					count[idx]++;
					
				}else {
					idx = idx + L - N;
							count[idx]++;
				}
			cnt++;	
			}
		}
		System.out.println(cnt);
	}
}