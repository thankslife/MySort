/**
 * 求最长公共子序列
 * @author Administrator
 *
 */
public class Test2 {

	public static void culate(String[] A,String[] B,int[][] result){
		for(int i = 0; i <= A.length; i++){
			result[0][i] = 0;
		}
		for(int i = 0; i <= B.length; i++){
			result[i][0] = 0;
		}
		
		for(int i = 1; i <= B.length; i++){
			for(int j = 1; j <= A.length; j++){
				if(B[i - 1].equals(A[j - 1]))
					result[i][j] = result[i - 1][j - 1] + 1;
				else if(result[i][j - 1] <= result[i - 1][j])
					result[i][j] = result[i - 1][j];
				else
					result[i][j] = result[i][j - 1];
				
			}
		}
		System.out.println(result[B.length][A.length]);
	}
	public static void main(String[] args){
		System.out.println("begin");
		String[] A = {"A","B","C","B","D","A","B"};
		String[] B = {"B","D","C","A","B","A","B"};
		int[][] result = new int[B.length + 1][A.length + 1];
		culate(A,B,result);
	}
}
