import java.util.Scanner;
import java.io.FileInputStream;


class Solution
{
	public static void main(String args[]) throws Exception
	{
				Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int result = 1;
		int [][] arr = new int[9][9];
		int [] countRow = new int[9];
		int [] countCol = new int[9];
		int [] countSq1 = new int[9];
		int [] countSq2 = new int[9];
		int [] countSq3 = new int[9];
	for(int i = 1 ; i <= T  ; i++) {
			for(int j = 0 ; j < 9;  j++) {
				for(int k = 0 ; k < 9 ; k++) {
					arr[j][k] = sc.nextInt();
					
				}
			}
			
			for(int w = 0 ; w < 9 ; w++) {
				for(int q = 0 ; q <9 ; q++) {
					countRow[arr[w][q] - 1]++ ;
					countCol[arr[q][w] -1]++;
				}
				for(int e = 0 ; e<9; e++) {
					if(countRow[e]>1) {
						result=0;
					}
					if(countCol[e]>1) {
						result=0;
					}
					countRow[e] = 0;
					countCol[e] = 0;
				}
			}
			
			for(int r=0 ; r<3 ; r++) {
				for(int c = 0 ; c<3 ;c++) {
					countSq1[arr[r][c] - 1]++;
				}
				for(int c = 3 ; c<6 ;c++) {
					countSq2[arr[r][c] - 1]++;
				}
				for(int c = 6 ; c<9 ;c++) {
					countSq3[arr[r][c] - 1]++;
				}
				
			}
			for(int e = 0 ; e<9; e++) {
				if(countSq1[e]>1) {
					result=0;
				}
				if(countSq2[e]>1) {
					result=0;
				}if(countSq3[e]>1) {
					result=0;
				}
				countSq1[e] = 0;
				countSq2[e] = 0;
				countSq3[e]=0;
			}
			for(int r=3 ; r<6 ; r++) {
				for(int c = 0 ; c<3 ;c++) {
					countSq1[arr[r][c] - 1]++;
				}
				for(int c = 3 ; c<6 ;c++) {
					countSq2[arr[r][c] - 1]++;
				}
				for(int c = 6 ; c<9 ;c++) {
					countSq3[arr[r][c] - 1]++;
				}
				
			}
			for(int e = 0 ; e<9; e++) {
				if(countSq1[e]>1) {
					result=0;
				}
				if(countSq2[e]>1) {
					result=0;
				}if(countSq3[e]>1) {
					result=0;
				}
				countSq1[e] = 0;
				countSq2[e] = 0;
				countSq3[e]=0;
			}
			for(int r=6 ; r<9 ; r++) {
				for(int c = 0 ; c<3 ;c++) {
					countSq1[arr[r][c] - 1]++;
				}
				for(int c = 3 ; c<6 ;c++) {
					countSq2[arr[r][c] - 1]++;
				}
				for(int c = 6 ; c<9 ;c++) {
					countSq3[arr[r][c] - 1]++;
				}
				
			}
			for(int e = 0 ; e<9; e++) {
				if(countSq1[e]>1) {
					result=0;
				}
				if(countSq2[e]>1) {
					result=0;
				}if(countSq3[e]>1) {
					result=0;
				}
				countSq1[e] = 0;
				countSq2[e] = 0;
				countSq3[e] = 0;
			}
			
	
		System.out.println("#" + i +" " + result);
		result=1;
		}
		
	}
}