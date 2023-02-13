import java.util.Scanner;
import java.io.FileInputStream;
import java.util.Arrays;
class Solution
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int t = 1 ; t<=T ; t++) {
			int N =sc.nextInt();
			int M =sc.nextInt();
			int K =sc.nextInt();
			int[]NTime = new int[N];
			boolean a = true;
			for(int i = 0 ; i < N ; i++) {
				NTime[i] = sc.nextInt();
			}
			Arrays.sort(NTime);
			int temp = NTime[0]/ M;
			int k = (NTime[0]/M) * K;
			
			for(int i = 0 ; i < N ; i++) {
				if(NTime[i]/M == 0) {
					System.out.println("#" + t +" Impossible");
					a = false;
					break;
				}else {
					if(temp == NTime[i]/ M) {
					temp = NTime[i]/ M;
					k--;
					}
					else if(temp != NTime[i]/M) {
						k += K * ((NTime[i]/M)- temp);
						temp = NTime[i]/ M;
						k--;
					}
					if(k < 0) {
						System.out.println("#" + t +" Impossible");
						a = false;
						break;
					}
				}
			}
			if(a == true) {
				System.out.println("#" + t +" Possible");
			}
			
		}
	}
}