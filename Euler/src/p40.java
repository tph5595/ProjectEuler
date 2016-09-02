//Done
public class p40 {
	public static void main(String[] args) {
		double time = System.currentTimeMillis();
		int total = 1;
		for (int i = 0; i < 7; total *= getDigit((int) Math.pow(10, i++)));
		System.out.println(total);
		System.out.println(System.currentTimeMillis()-time);
	}

	public static int getDigit(int pos) {
		int curPos = 0, digit = 0;
		while (curPos < pos) {
			curPos += vals(++digit);
		}
		while (curPos != pos) {
			digit /= 10;
			curPos--;
		}
		return digit % 10;
	}

	public static int vals(int num) {
		if (num == 0)
			return 0;
		return 1 + vals(num / 10);
	}
}