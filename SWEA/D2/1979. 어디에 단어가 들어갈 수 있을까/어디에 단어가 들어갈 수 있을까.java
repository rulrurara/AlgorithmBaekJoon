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
		for(int t = 1 ; t<=T ;t++ ) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			int[][] arr = new int [N][N];
		
			int result = 0;
			for(int i = 0 ; i < N;i++) {
				for(int j = 0 ; j < N ; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			for(int i = 0 ; i < N;i++) {
				int rowCnt  = 0;
				int colCnt = 0 ;
				for(int j = 0 ; j<N ;j++) {
					if(arr[i][j] == 1) {
						rowCnt++;
					}else if (arr[i][j] == 0) {
						rowCnt = 0;
					}
					if(arr[j][i] ==1) {
						colCnt++;
					}else if(arr[j][i]==0) {
						colCnt = 0;
					}
					
					if(j+1 <N) {
						if(rowCnt == K && arr[i][j+1] ==0 ) {
							result++;
						}
						if(colCnt ==K && arr[j+1][i] ==0) {
							result++;
						}
					}else {
						if(rowCnt == K ) {
							result++;
						}
						if(colCnt ==K) {
							result++;
						}
					}
				}
				
			}
			System.out.println("#" + t +" "+result);
			
			
		}
		
	}
}