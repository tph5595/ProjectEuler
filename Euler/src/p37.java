import java.math.BigInteger;
import java.util.ArrayList;
//Done
//748317
public class p37 {

	public static void main(String[] args) {
		ArrayList<Integer> primes = genPrimes(1000000);
		BigInteger total = BigInteger.ZERO;
		System.out.println("\n");
		for (int i = 4; i < primes.size(); i++) {
			//System.out.println(primes.get(i));
			if (check(primes, i)) {
				System.out.println(primes.get(i));
				total = total.add(new BigInteger(""+primes.get(i)));
			}
		}
		System.out.println(total);
	}

	public static boolean check(ArrayList<Integer> primes, int ndx) {
		int start = primes.get(ndx);
		int i = 0;
		start /= 10;
		while (start != 0) {
			if (primes.indexOf(start) == -1)
				return false;
			i++;
			start /= 10;
		}
		start = primes.get(ndx);
		//System.out.println("\t"+start);
		start %= Math.pow(10, i);
		//System.out.println("\t"+start);
		while (start != 0) {
			if (primes.indexOf(start) == -1)
				return false;
			start %= Math.pow(10, i);
			i--;
		}

		return true;
	}

	public static ArrayList<Integer> genPrimes(int max) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		primes.add(2);
		boolean found = false;

		for (int i = 3; i <= max; i += 2) {
			found = false;
			for (int j = 0; j < primes.size(); j++) {
				if (i % primes.get(j) == 0) {
					found = true;
					break;
				}
			}
			if (!found) {
				System.out.println(i);
				primes.add(i);
			}
		}
		return primes;
	}
}
