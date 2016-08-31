
public class p36 {

	public static void main(String[] args) {
		int total = 0;
		for (int i = 1; i < 1000000; i++) {
			if (isPal(i + "") && isPal(Integer.toBinaryString(i))) {
				System.out.println(i);
				total += i;
			}
		}

		System.out.println(total);
	}

	public static boolean isPal(String num) {
		int len = num.length() - 1;
		//System.out.println(len);
		for (int i = 0; i < len / 2; i++) {
			if (num.charAt(i) != num.charAt(len - i)) {
				return false;
			}
		}
		if (num.charAt(len / 2) == num.charAt(len - len / 2))
			return true;
		return false;
	}
}
