package activity;

public class number1 {
	public static void main(String[] args) {
		
		int a[][] = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		int b[][] = {
				{1,0,0},
				{0,2,0},
				{0,0,3}
		};
		int[][] ans = new int[a.length][a[1].length];
		
		for(int h = 0; h < ans.length; h++) {
			for(int i = 0; i < a.length; i++) {
				for(int j = 0; j < a[i].length; j++) {
					ans[h][i] = ans[h][i] + a[h][j]*b[j][i];
				}
			}
		}
		
		for(int i = 0; i < ans.length; i++) {
			for(int j = 0; j < ans[i].length; j++) {
				if(ans[i][j] < 10)System.out.print(" ");
				System.out.print(ans[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}