import java.math.BigInteger;
import java.util.ArrayList;
//Done
public class p3_2 {
	public static void main(String[] args) {
		BigInteger zero = new BigInteger("0");
		BigInteger two = new BigInteger("2");
		BigInteger max = new BigInteger("0");//163;
		BigInteger num = new BigInteger("600851475143");
		ArrayList<BigInteger> primes = new ArrayList<BigInteger>();
		primes.add(new BigInteger("2"));
		boolean found = false;
		int size = 1, s2 = 1;
		BigInteger i = new BigInteger("3");
		while(num.compareTo(i) > 0){
			s2++;
			if(s2%10000 == 0){
				System.out.println(""+(s2));
			}
			found = false;
			i = i.add(two);
			for(int j = 0; j < size; j++){
				if(i.mod(primes.get(j)).compareTo(zero) == 0){
					found = true;
					break;
				}
			}
			if(!found){
				//System.out.println(i+"");
				primes.add(i);
				size++;
				if(num.mod(i).compareTo(zero) == 0 ){
					System.out.println(i+"*************************************************");
					if(i.compareTo(max) > 0)
						max = i;
					num = num.divide(i);
				}
			}
		}
		System.out.println("\n\n"+max);

	}

}