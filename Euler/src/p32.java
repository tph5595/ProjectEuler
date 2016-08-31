import java.math.BigInteger;
import java.util.ArrayList;
//Done
public class p32 {

	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		BigInteger total = BigInteger.ZERO;
		for (int i = 0; i < 99999; i++) {
			for (int j = 0; j < 999; j++) {
				if (pan(i, j, i * j) && nums.indexOf(i * j) == -1) {
					System.out.println(i*j);
					nums.add(i * j);
				}
			}
		}
		for (int i = 0; i < nums.size(); i++) {
			total = total.add(new BigInteger("" + nums.get(i)));
		}
		System.out.println(total);
	}

	public static boolean pan(int a, int b, int c) {
		int i = a, j = b, k = c;
		ArrayList<Integer> found = new ArrayList<Integer>();
		while (a != 0) {
			if (found.indexOf(a % 10) == -1)
				found.add(a % 10);
			else
				return false;
			a = a / 10;
		}
		while (b != 0) {
			if (found.indexOf(b % 10) == -1)
				found.add(b % 10);
			else
				return false;
			b = b / 10;
		}
		while (c != 0) {
			if (found.indexOf(c % 10) == -1)
				found.add(c % 10);
			else
				return false;
			c = c / 10;
		}
		if (found.size() == 9 && found.indexOf(0) == -1) {
			System.out.println(i + "\t" + j + "\t" + k);
			return true;
		}
		return false;
	}
}