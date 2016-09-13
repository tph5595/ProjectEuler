import java.util.ArrayList;

public class p50 {

	public static void main(String[] args) {
		int max = 1000;
		ArrayList<Integer> primes = genPrimes(max);
		int bot = 0, top = 0, cur = 0, best = 0, besti = 0;
		// get initial
		while (cur < max) {
			cur +=primes.get(top);
			top++;
		}
		// keep checking
		while (bot != primes.size()-1) {
			if (cur + primes.get(top) < max) {
				cur += primes.get(top);
				top++;
			} else {
				cur -= primes.get(bot);
				bot++;
			}
			if(primes.indexOf(cur) != -1 && top-bot > best){
				best = top-bot;
				besti = cur;
			}
		}
		System.out.println(besti);

	}

	public static ArrayList<Integer> genPrimes(int maxPrime) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		primes.add(2);
		boolean found = false;
		for (int i = 3; i < maxPrime; i += 2) {
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

}
