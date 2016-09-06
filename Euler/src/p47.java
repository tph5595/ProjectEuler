import java.util.ArrayList;
import java.util.Collections;

public class p47 {

	public static void main(String[] args) {
		ArrayList<Integer> primes = genPrimes(5000);
		ArrayList<ArrayList<Integer>> factors = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> temp;
		int ndx = 0;
		for (int i = 3;; i++) {
			if (ndx == 3) {
				System.out.println(i - 2);
				return;
			}
			temp = getFactors(primes, i);

			if (temp.size() == 3) {
				factors.add(temp);
				if (ndx > 0) {
					for (int j = 0; j < ndx; j++) {
						for (int k : factors.get(j)) {
							System.out.println("f: " + factors.size());
							if (factors.get(factors.size() - 1).indexOf(k) != -1) {
								for (int n = 0; n <= j; n++) {
									factors.remove(n);
									ndx--;
								}
							}
						}
					}
				}
				ndx++;

			}
			System.out.println(i + "\t" + ndx + "\t" + temp.size());
		}
	}

	public static ArrayList<Integer> getFactors(ArrayList<Integer> primes, int num) {
		ArrayList<Integer> fac = new ArrayList<Integer>();
		if (primes.indexOf(num) != -1) {
			fac.add(num);
			return fac;
		}
		while (num > 1) {
			for (int i = 0; primes.get(i) <= num; i++) {
				if (num % primes.get(i) == 0) {
					// System.out.println(num % primes.get(i));
					num /= primes.get(i);
					fac.add(primes.get(i));
					// System.out.println("boop "+primes.get(i)+"\t"+num);
				}
				if (num == 1)
					break;
			}
			// System.out.println("loop "+num);
		}
		System.out.println(fac.size());
		// compress
		ArrayList<Integer> com = new ArrayList<Integer>();
		Collections.sort(fac);
		int cur = fac.get(0);
		for (int i = 1; i < fac.size(); i++) {
			if (fac.get(i) != fac.get(i - 1)) {
				// System.out.println("here");
				com.add(cur);
			} else {
				cur *= fac.get(i);
			}
		}
		com.add(cur);
		return com;
	}

	public static ArrayList<Integer> genPrimes(int numPrimes) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		primes.add(2);
		boolean found = false;
		for (int i = 3; primes.size() < numPrimes; i += 2) {
			found = false;
			for (int j = 0; j < primes.size(); j++) {
				if (i % primes.get(j) == 0) {
					found = true;
					break;
				}
			}
			if (!found) {
				primes.add(i);
			}
		}
		return primes;
	}
}
