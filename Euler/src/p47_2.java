import java.util.ArrayList;

public class p47_2 {

	public static void main(String[] args) {
		int numPrimes = 100000, streak = 0, wanted = 4;
		ArrayList<Integer> primes = genPrimes(numPrimes);
		for (int i = 3; i < Math.pow(2, 31); i++) {
			if (streak == wanted) {
				System.out.println(i - wanted);
				return;
			}
			if (check(primes, i, wanted)) {
				streak++;
			} else {
				streak = 0;
			}
			System.out.println(i + "\t" + streak);

		}
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
				System.out.println("gen: " + i);
				primes.add(i);
			}
		}
		return primes;
	}

	public static boolean check(ArrayList<Integer> primes, int num, int cnti) {
		int cnt = 0;
		for (int i = 0; primes.get(i) < num; i++) {
			if (num % primes.get(i) == 0) {
				cnt++;
			}
		}
		return (cnt == cnti) ? true : false;
	}

}
