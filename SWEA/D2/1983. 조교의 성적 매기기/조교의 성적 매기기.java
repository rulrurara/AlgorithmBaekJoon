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
		for(int t = 1 ; t<=T ; t++) {
			
			int N = sc.nextInt();
			int k = sc.nextInt() -1;
			double[] sum = new double[N]; 
			for(int i = 0 ; i<N;i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				int c = sc.nextInt();
				sum[i] = a*0.35 + b*0.45 + c*0.2;
			}
			double KK = sum[k];
			int idx = 0;
			Arrays.sort(sum);
			int NN = N /10;
			for(int i = 0 ; i<N;i++) {
				if(sum[i] == KK) {
					idx = i;
				}
			}
			
			if(idx / NN == 0) {
				System.out.println("#" + t +" " +"D0");
			}
			if(idx / NN == 1) {
				System.out.println("#" + t +" " +"C-");
			}
			if(idx / NN == 2) {
				System.out.println("#" + t +" " +"C0");
			}
			if(idx / NN == 3) {
				System.out.println("#" + t +" " +"C+");
			}
			if(idx / NN == 4) {
				System.out.println("#" + t +" " +"B-");
			}
			if(idx / NN == 5) {
				System.out.println("#" + t +" " +"B0");
			}
			if(idx / NN == 6) {
				System.out.println("#" + t +" " +"B+");
			}
			if(idx / NN == 7) {
				System.out.println("#" + t +" " +"A-");
			}
			if(idx / NN == 8) {
				System.out.println("#" + t +" " +"A0");
			}
			if(idx / NN == 9) {
				System.out.println("#" + t +" " +"A+");
			}
			
			
			
		}
	}
}