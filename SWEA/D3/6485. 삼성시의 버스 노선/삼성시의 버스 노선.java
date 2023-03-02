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
			//버스노선 개수
			int N = sc.nextInt();
			//각 버스노선은 A~B까지의 정류장만 다닌다
			int[] A = new int[N+1];
			int[] B = new int[N+1];
			for(int i = 1 ; i<=N ; i++) {
				A[i] = sc.nextInt();
				B[i] = sc.nextInt();
			}
			//정류장의 개수
			int P = sc.nextInt();
			//정류장의 번호
			int[] C = new int[P+1];
			for (int i = 1; i <= P; i++) {
				C[i] = sc.nextInt();
			}
			
			int[] count = new int[5001]; 
			for (int i = 1; i <= N; i++) { // 1번부터 N번 버스노선까지..
				for (int j = A[i]; j <= B[i]; j++) {
					count[j]++;
				}
			}
			
			System.out.print("#" + t );
			for (int i = 1; i <= P; i++) {
				System.out.print(" "+count[C[i]]);
			}
			System.out.println();
		}
	}
	
}