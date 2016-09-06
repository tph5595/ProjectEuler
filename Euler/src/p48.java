import java.math.BigInteger;

public class p48 {
	// I feel bad for this code...I'm sorry mom
	//Also the answer is off by 1... idk why 
	public static void main(String[] args) {
		BigInteger total = BigInteger.ZERO;
		for (int i = 0; i <= 1000; i++) {
			System.out.println(i);
			total = total.add(new BigInteger(""+i).pow(i));
		}
		System.out.println(total.mod(new BigInteger("10000000000")));
	}

}
