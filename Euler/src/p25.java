import java.math.BigInteger;
//Done
public class p25 {

	public static void main(String[] args) {
		BigInteger nm1 = BigInteger.ONE;
		BigInteger nm2 = BigInteger.ONE;
		BigInteger n = nm1.add(nm2);
		int i = 3;
		while(!calcDigits(n)){
			System.out.println(n);
			nm2 = nm1;
			nm1 = n;
			n = nm1.add(nm2);
			i++;
		}
		System.out.println(n+"\n"+i);
		
	}
	public static boolean calcDigits(BigInteger num){
		int j;
		for(j = 0; j < 999; j++){
			num = num.divide(BigInteger.TEN);
			//System.out.println("\t"+num);
			if(num.equals(BigInteger.ZERO))
				return false;
		}
		return true;
	}

}
