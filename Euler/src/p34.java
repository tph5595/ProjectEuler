import java.math.BigInteger;
import java.util.ArrayList;

public class p34 {

	public static void main(String[] args) {
		BigInteger total = BigInteger.ZERO;
		int cur;
		ArrayList<Integer> nums = new ArrayList<Integer>();
		for (int n1 = 0; n1 < 10; n1++) {
			for (int n2 = 0; n2 < 10; n2++) {
				for (int n3 = 0; n3 < 10; n3++) {
					for (int n4 = 0; n4 < 10; n4++) {
						for (int n5 = 0; n5 < 10; n5++) {
							cur = check(n1, n2, n3, n4, n5);
							if (cur != -1) {
								//cur = fac(n1) + fac(n2) + fac(n3) + fac(n4) + fac(n5);
								if (nums.indexOf(cur) == -1) {
									nums.add(cur);
									total = total.add(new BigInteger("" + cur));
									System.out.println(cur + "\n" + n1 + "\t" + n2 + "\t" + n3 + "\t" + n4 + "\t" + n5);
								}
							}
						}
					}
				}
			}
		}
		System.out.println(total);// + "\n" + fac());
	}

	public static int check(int a, int b, int c, int d, int e) {
		ArrayList<BigInteger> in = new ArrayList<BigInteger>();
		BigInteger t = BigInteger.ZERO;
		int total = 0;
		int cnt = 0;
		if ((a == 0 && in.size() != 0) || a != 0) {
			cnt++;
			in.add(new BigInteger("" + a));
			total = total*10+a;
			t = t.add(new BigInteger("" + fac(a)));
		}
		if ((b == 0 && in.size() != 0) || b != 0) {
			cnt++;
			total = total*10+b;
			in.add(new BigInteger("" + b));
			t = t.add(new BigInteger("" + fac(b)));
		}
		if ((c == 0 && in.size() != 0) || c != 0) {
			cnt++;
			total = total*10+c;
			in.add(new BigInteger("" + c));
			t = t.add(new BigInteger("" + fac(c)));
		}
		if ((d == 0 && in.size() != 0) || d != 0) {
			cnt++;
			total = total*10+d;
			in.add(new BigInteger("" + d));
			t = t.add(new BigInteger("" + fac(d)));
		}
		if ((e == 0 && in.size() != 0) || e != 0) {
			cnt++;
			total = total*10+e;
			in.add(new BigInteger("" + e));
			t = t.add(new BigInteger("" + fac(e)));
		}

		// System.out.println(t);

		/*while (in.size() > 0) {
			if (in.indexOf(t.mod(BigInteger.TEN)) != -1) {
				cnt--;
				in.remove(in.indexOf(t.mod(BigInteger.TEN)));
			} else {
				return -1;
			}
			t = t.divide(BigInteger.TEN);
		}*/
		if(total == 0 || total == 1 || total == 2)
			return -1;
		if(t.compareTo(new BigInteger(""+total)) == 0)
			return total;
		if (t.compareTo(BigInteger.ZERO) == 0 && cnt == 0)
			return total;
		return -1;
	}

	public static int fac(int num) {
		int total = 1;
		if (num == 0)
			return 1;
		for (int i = 1; i < num; i++) {
			total = total * i;
		}
		// System.out.println(total * num + "\t" + num);
		return total * num;
	}
}
