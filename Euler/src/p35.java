import java.util.ArrayList;
//Done
public class p35 {
	public static void main(String[] args) {
		ArrayList<Integer> primes = genPrimes(1000000);
		 int cnt = 0;
		 for (int i = 0; i < primes.size(); i++) {
		 System.out.println(primes.get(i));
		 if (circle(primes, i) == true)
		 cnt++;
		 }
		System.out.println(cnt);
	}

	public static boolean circle(ArrayList<Integer> primes, int num) {
		int start = primes.get(num);
		num = flip(start);
		//System.out.println(start + "\t" + num);
		while (start != num) {
			// System.out.println(start + "\t" + num);
			if (primes.indexOf(num) == -1) {
				return false;
			}
			num = flip(num);
		}

		return true;
	}

	public static int flip(int n) {
		if (n < 10)
			return n;
		int i = -1;
		int tmp = n;
		while (tmp != 0) {
			tmp = tmp / 10;
			i++;
		}
		System.out.println(i);
		return (int) (n / 10 + ((n % 10) * Math.pow(10, i)));
	}

	public static ArrayList<Integer> genPrimes(int max) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		primes.add(2);
		boolean found = false;

		for (int i = 3; i <= max; i += 2) {
			// System.out.println(i);
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
