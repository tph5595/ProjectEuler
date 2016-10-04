import java.util.ArrayList;

public class p51 {

	public static void main(String[] args) {
		int goal = 8;
		ArrayList<Integer> primes = new ArrayList<Integer>();
		ArrayList<String> patterns = new ArrayList<String>();
		ArrayList<Integer> patNum = new ArrayList<Integer>();
		primes.add(2);
		int maxPat = 0, ndx = 0, curVal = 0, boop;
		ArrayList<String> strs = null;
		while (maxPat < goal) {
			// System.out.println("wot.");
			boop = nextPrime(primes);
			primes.add(boop);

			if (primes.get(ndx) > 56000) {
				// System.out.println("Testing real: " + boop);
				strs = parse(primes.get(ndx));
				// System.out.println("parsed");
				if (strs != null) {
					for (int i = 0; i < strs.size(); i++) {
						if (patterns.indexOf(strs.get(i)) == -1) {
							patterns.add(strs.get(i));
							patNum.add(1);
						} else {
							curVal = patNum.get(patterns.indexOf(strs.get(i))) + 1;
							patNum.set(patterns.indexOf(strs.get(i)), curVal);
							if (curVal > maxPat)
								maxPat = curVal;
						}
					}
				}
			}
			// System.out.println("boopy");
			if (maxPat != goal) {
				ndx++;
				System.out.println("Testing: " + boop + "\t" + maxPat + "\t" + curVal);
			}
		}

	}

	private static ArrayList<String> parse(int num) {
		ArrayList<String> patterns = new ArrayList<String>();
		// split num into array
		int size = size(num);
		String str;
		int[] val = new int[size];
		for (int i = 0; i < size; i++) {
			val[size - 1 - i] = num % 10;
			num /= 10;
		}
		// find all pairs
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (val[i] == val[j]) {
					str = "";
					for (int k = 0; k < size; k++) {
						if (k == i || k == j)
							str += '*';
						else
							str += val[k];
					}
					if (patterns.indexOf(str) == -1) {
						patterns.add(str);
					}
				}
			}
		}
		if (patterns.size() > 0)
			return patterns;
		return null;
	}

	public static int size(int num) {
		if (num < 10)
			return 1;
		return size(num / 10) + 1;
	}

	public static int nextPrime(ArrayList<Integer> primes) {
		boolean found;
		int maxPrime = primes.get(primes.size() - 1);
		for (int i = maxPrime + 1;; i++) {
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
	}

}
