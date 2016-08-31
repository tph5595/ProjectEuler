import java.math.BigInteger;
//Done
public class p20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger fac = BigInteger.ONE;
		BigInteger sum = BigInteger.ZERO;
		for(int i = 1; i <= 100; i++){
			fac = fac.multiply(new BigInteger(i+""));
		}
		while(fac.compareTo(BigInteger.ZERO) > 0){
			sum = sum.add(fac.mod(BigInteger.TEN));
			fac = fac.divide(BigInteger.TEN);
		}
		System.out.println(sum);
	}

}
