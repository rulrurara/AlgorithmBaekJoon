import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sNum = sc.nextInt();
		int[] status = new int[sNum+1];
		for (int i = 1; i < status.length; i++) {
			status[i] = sc.nextInt();
		}
		int per = sc.nextInt();
		int[] se = new int[per];
		int[] num = new int[per];
		for (int i = 0; i < per; i++) {
			se[i] = sc.nextInt();
			num[i] = sc.nextInt();
		}
		for (int i = 0; i < num.length; i++) {
			if(se[i] == 1) {
				for (int j = num[i]; j < status.length; j+=num[i]) {
					if(status[j] == 1) {
						status[j] =0;
					}
					else if(status[j] == 0) {
						status[j] =1;
					}
				}
			}
			if(se[i] == 2) {
				int lt = num[i];
				int rt = num[i];
				if(status[lt] == 1) {
					status[lt] =0;
				}
				else if(status[lt] ==0) {
					status[lt] =1;
				}
				
				lt--;
				rt++;
				
				while(true) {
					if(lt<=0 || rt>=status.length) {
						break;
					}
					if(status[lt] == status[rt]) {
						if(status[lt] == 1) {
							status[lt] =0;
						}
						else if(status[lt] ==0) {
							status[lt] =1;
						}
						if(status[rt] == 1) {
							status[rt] =0;
						}
						else if(status[rt] ==0) {
							status[rt] =1;
						}
						lt--;
						rt++;
					}else {
						break;
					}
				
					
				}
				
				
			}
		}
		int cnt = 0;
		for (int i = 1; i < status.length; i++) {
			System.out.print(status[i] +" ");
			cnt++;
			if(cnt%20 ==0) {
				System.out.println();
			}
		}
	}
}