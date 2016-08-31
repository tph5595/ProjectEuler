import java.math.BigInteger;
import java.util.ArrayList;

public class p10 {

	public static void main(String[] args) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		primes.add(2);
		int size = 1;
		long i = 1;
		BigInteger sum = new BigInteger("2");
		boolean found = false;
		while(i < 2000000){
			found = false;
			i++;
			i++;
			for(int j = 0; j < size; j++){
				if(i%primes.get(j) == 0){
					System.out.println(i+"->"+primes.get(j));
					found = true;
					break;
				}
			}
			if(!found){
				primes.add((int)i);
				size++;
				System.out.println(""+i);
				sum = sum.add(BigInteger.valueOf(i));
			}
		}
		System.out.println(""+sum);
	}

}
