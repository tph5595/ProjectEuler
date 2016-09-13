import java.util.ArrayList;

public class p51 {

	public static void main(String[] args) {
		int max = 1000000;
		ArrayList<Integer> primes   = new ArrayList<Integer>();
		ArrayList<String>  patterns = new ArrayList<String>();
		ArrayList<Integer> patNum   = new ArrayList<Integer>();
		primes.add(2);
		int maxPat = 0;
		while (maxPat < 8) {
			
		}

	}

	public static int nextPrime(ArrayList<Integer>primes, int maxPrime) {
		boolean found;
		for (int i = maxPrime+1;; i += 2) {
			found = false;
			for (int j = 0; j < primes.size(); j++) {
				if (i % primes.get(j) == 0) {
					found = true;
					break;
				}
			}
			if (!found) {
				return i;
			}
		}
		//return primes;
	}

}
