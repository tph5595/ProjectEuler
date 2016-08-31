import java.math.BigInteger;
//Done
public class p15 {

	public static void main(String[] args) {
		//must be even
		int size = 20;
		BigInteger arr [][] = new BigInteger[size+1][size+1];
		arr[0][0] = BigInteger.ONE;
		BigInteger tmp = BigInteger.ZERO;
		
		//Target to middle diagonal 
		for(int i = 1; i <= size; i++){
			for(int j = 0, k = i; k > -1; k--, j++ ){
				tmp = BigInteger.ZERO;
				if(j > 0) 
					tmp = tmp.add(arr[j-1][k]);
				if(k > 0)
					tmp = tmp.add(arr[j][k-1]);
				arr[j][k] = tmp;
			}
		}
		for(int i = 1; i <= size; i++){
			for(int j = i, k = size; k >= i; k--, j++ ){
				tmp = BigInteger.ZERO;
				if(j > 0) 
					tmp = tmp.add(arr[j-1][k]);
				if(k > 0)
					tmp = tmp.add(arr[j][k-1]);
				arr[j][k] = tmp;
			}
		}
		for(int i = 0; i < size+1; i++){
			for(int j = 0; j < size+1; j++){
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println(arr[size][size]);

	}
	
	
	
	/*brute force takes too long
	 * 
	 * 
	 * public static int numPaths(int x, int y, int maxX, int maxY){
	 
		int num = 0;
		if(x == maxX && y == maxY){
			System.out.println("return");
			return 1;
		}
		System.out.println("Branch 1");
		if(x < maxX) num+=numPaths(x+1, y, maxX, maxY);
		System.out.println("Branch 2");
		if(y < maxY) num+=numPaths(x, y+1, maxX, maxY);
		System.out.println("up");
		return num;
	}*/
}
