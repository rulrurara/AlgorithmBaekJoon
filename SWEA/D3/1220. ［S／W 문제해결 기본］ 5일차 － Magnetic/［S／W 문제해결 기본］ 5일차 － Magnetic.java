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
		for (int t = 1; t <= 10; t++) {
			sc.nextInt();
			int[][] arr = new int[100][100];
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			//위 아래로만 비교
			//위 N 1 N
			//1 - > 2 이 있으면 cnt 세고 둘다 0으로 변경
			//2만나기 전에 1 -> 1 있으면 2번째 1도 0으로 변경
			int cnt = 0;
			for (int i = 0; i < arr.length; i++) {
				outer : for (int j = 0; j < arr.length; j++) {
					if(arr[j][i] == 1) {
							for (int q = j+1; q < arr.length; q++) {
								if(arr[q][i]==1) {
									arr[q][i] = 0;
									continue;
								}
								if(arr[q][i]==2) {
									cnt++;
									arr[j][i] = 0;
									arr[q][i] = 0;
									//j를 q부터 새도 되기 떄문에 j를 q로 변경
									j=q;
									continue outer;
								}
							}
						
					}
				}
			}
			System.out.println("#" + t+" " + cnt);
		}
	}
}