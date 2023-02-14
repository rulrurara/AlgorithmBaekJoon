import java.util.Scanner;
import java.io.FileInputStream;


class Solution
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int t=1;t<=T;t++) {
            int cnt = 0;
            int cnt2 = 0;
            int N = sc.nextInt();
            int[] arr = new int[N];
            for(int n=0 ; n<N; n++) {
                arr[n] = sc.nextInt();
            }
            int max = 0;
            int[] dp = new int[N];
            dp[0] = 1;
            for(int i =1; i <N ;i++) {
            	dp[i]=1;
                for(int j = 0 ;j<=i-1;j++  ){
                    if(arr[i]>arr[j] && dp[j] + 1 >dp[i]) {
                        dp[i] = dp[j] +1;
                    }if(dp[i] > max) {
                        max = dp[i];
                    }
                }
            }
            System.out.println("#" + t +" "+ max);
    }
}
}