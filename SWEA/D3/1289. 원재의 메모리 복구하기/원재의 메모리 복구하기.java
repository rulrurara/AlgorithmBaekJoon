
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
		for(int t = 1 ; t<=T;t++) {
			int cnt = 0;
			String base = "";
			String str= sc.next();
			for(int i = 0 ; i<str.length();i++) {
				base += "0";
			}
			char[] strArray = str.toCharArray();
			char[] baseArray = base.toCharArray();
			for(int i = 0 ; i<str.length();i++) {
				if(strArray[i] != baseArray[i]) {
					cnt++;
					for(int j = i ; j<str.length() ; j++) {
						if(baseArray[j] =='0') {
							baseArray[j] = '1';
							
						}else {
							baseArray[j] = '0';
						}
					}
				} 
			}
			System.out.println("#"+t+" "+cnt);
			
		}
	}
}