import java.util.ArrayList;
//Done 5482660
public class p44 {
	public static void main(String[] args) {
		ArrayList<Long> penNum = new ArrayList<Long>();
		long a, b;
		long bestD = (long) Math.pow(2, 63);
		for (int i = 1; i < 100000; i++) {
			penNum.add(genNum(i));
		}
		for (int i = 1; i < 50000; i++) {
			for (int j = 0; j < i; j++) {
				a = penNum.get(i);
				b = penNum.get(j);
				System.out.println(i + "\t" + a + "\t" + b + "\t" + bestD);
				if (Math.abs(a - b) < bestD) {
					if (penNum.indexOf(Math.abs(a + b)) != -1 && penNum.indexOf(Math.abs(a - b)) != -1) {
						System.out.println(a + "\t" + b + "\t" + bestD);
						bestD = Math.abs(a - b);
					}
				}
			}
		}
		System.out.println(bestD);
	}

	public static long genNum(long i) {
		return i * (3L * i - 1L) / 2L;
	}
}