import java.util.ArrayList;

public class p49 {

	public static void main(String[] args) {
		int maxPrime = 10000;
		ArrayList<Integer> primes = genPrimes(maxPrime);
		for (int i = 0; i < primes.size(); i++) {
			if (primes.get(i)>1000 && check(primes, primes.get(i))) {
				System.out.println(primes.get(i));
			}
		}
	}

	public static ArrayList<Integer> genPrimes(int numPrimes) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		primes.add(2);
		boolean found = false;
		for (int i = 3; i < numPrimes; i += 2) {
			found = false;
			for (int j = 0; j < primes.size(); j++) {
				if (i % primes.get(j) == 0) {
					found = true;
					break;
				}
			}
			if (!found) {
				System.out.println("gen: " + i);
				primes.add(i);
			}
		}
		return primes;
	}

	public static boolean check(ArrayList<Integer> primes, int ndx) {
		ndx = (ndx/10)+(1000*(ndx%10));
		if(primes.indexOf(ndx) == -1)
			return false;
		ndx = (ndx/10)+(1000*(ndx%10));
		if(primes.indexOf(ndx) == -1)
			return false;
		return true;
	}
}
