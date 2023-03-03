/////////////////////////////////////////////////////////////////////////////////////////////
// 기본 제공코드는 임의 수정해도 관계 없습니다. 단, 입출력 포맷 주의
// 아래 표준 입출력 예제 필요시 참고하세요.
// 표준 입력 예제
// int a;
// double b;
// char g;
// String var;
// long AB;
// a = sc.nextInt();                           // int 변수 1개 입력받는 예제
// b = sc.nextDouble();                        // double 변수 1개 입력받는 예제
// g = sc.nextByte();                          // char 변수 1개 입력받는 예제
// var = sc.next();                            // 문자열 1개 입력받는 예제
// AB = sc.nextLong();                         // long 변수 1개 입력받는 예제
/////////////////////////////////////////////////////////////////////////////////////////////
// 표준 출력 예제
// int a = 0;                            
// double b = 1.0;               
// char g = 'b';
// String var = "ABCDEFG";
// long AB = 12345678901234567L;
//System.out.println(a);                       // int 변수 1개 출력하는 예제
//System.out.println(b); 		       						 // double 변수 1개 출력하는 예제
//System.out.println(g);		       						 // char 변수 1개 출력하는 예제
//System.out.println(var);		       				   // 문자열 1개 출력하는 예제
//System.out.println(AB);		       				     // long 변수 1개 출력하는 예제
/////////////////////////////////////////////////////////////////////////////////////////////
import java.util.Scanner;
import java.io.FileInputStream;
import java.util.Arrays;
/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */
class Solution
{
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int t = 1; t <= T; t++) {
			//나무의 개수
			int N = sc.nextInt();
			int[] arr = new int[N];
			for (int i = 0; i < N; i++) {
				arr[i] = sc.nextInt();
			}
			//제일 큰 값 만큼 키울건데
			//i가 홀수번쨰면 +1만 가능하고
			//i가 짝수면 +2만 가능 -> 실시간으로 값 더해주어야 함 
			//반복문이 최소 되는 거 구해야함
			//만약 2가 부족한대 다음이 홀수라면 더해주지 말고 짝수일에 더해주기 끝
			Arrays.sort(arr);
			//홀수인지 짝수날인지 보기
			int cnt = 1;
			//부족한 값이 총 몇인지
			while(true) {
				int end = 0;
				for (int i = 0; i < N; i++) {
					if(arr[i] == arr[N-1]) {
						end++;
					}
				}
				if(end >= N) {
					break;
				}
				if(cnt % 2 == 1) {
					cnt++;
					for (int i = arr.length-1; i >= 0; i--) {
						if(arr[N-1] - arr[i] ==2) {
							continue;
						}
						if(arr[i] + 1 <= arr[N-1]) {
							arr[i] = arr[i] +1;
							break;
						} 
					}
				}
				else if(cnt % 2 == 0) {
					cnt++;
					for (int i = arr.length-1; i >= 0; i--) {
						if(arr[i] + 2 <= arr[N-1]) {
							arr[i] = arr[i] +2;
							break;
						}
					}
				}
				
				
			}
			cnt = cnt-1;
			System.out.println("#" + t + " " + cnt);
		}
	}
}