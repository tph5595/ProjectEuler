import java.util.ArrayList;

public class p49 {

	public static void main(String[] args) {
		int maxPrime = 10000;
		ArrayList<Integer> primes = genPrimes(maxPrime);
		for (int i = 0; i < primes.size(); i++) {
			if (primes.get(i) > 1000) {
				check(primes, primes.get(i));
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

	public static void check(ArrayList<Integer> primes, int in) {
		ArrayList<Integer> valid = new ArrayList<Integer>();
		int back = in;
		int[] num = new int[4];
		int cur;
		num[3] = in % 10;
		in = in / 10;
		num[2] = in % 10;
		in = in / 10;
		num[1] = in % 10;
		in = in / 10;
		num[0] = in % 10;
		if (back != (num[0] * 1000) + (num[1] * 100) + (num[2] * 10) + num[3]) {
			System.out.println("broke deconstruct on " + back + "!!!" + "\t"
					+ (num[0] * 1000) +"+"+ (num[1] * 100) +"+"+ (num[2] * 10) +"+"+num[3]);
		}
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 2; k++) {
					for (int l = 0; l < 1; l++) {
						while (j == i)
							j++;
						while (k == j || j == i)
							k++;
						while (l == j || l == k || l == i)
							l++;
						cur = (num[i] * 1000) + (num[j] * 100) + (num[k] * 10) + num[l];
						if (primes.indexOf(cur) != -1 && valid.indexOf(cur) == -1) {
							valid.add(cur);
						}
					}
				}
			}
		}
		for (int i = 0; i < valid.size() - 2; i++) {
			for (int j = i + 1; j < valid.size() - 1; j++) {
				if (valid.indexOf(valid.get(j) + valid.get(j) - valid.get(i)) != -1) {
					System.out.println(
							valid.get(i) + "\t" + valid.get(j) + "\t" + (valid.get(j) + valid.get(j) - valid.get(i)));
				}
			}
		}
	}
}
