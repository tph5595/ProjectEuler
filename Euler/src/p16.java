import java.math.BigInteger;
//Done
public class p16 {

	public static void main(String[] args) {
		BigInteger num = new BigInteger("2");
		num = num.pow(1000);
		BigInteger sum = BigInteger.ZERO;
		while(num.compareTo(BigInteger.ZERO) > 0){
			sum = sum.add(num.mod(BigInteger.TEN));
			num = num.divide(BigInteger.TEN);
		}
		System.out.println(sum);
	}
}
