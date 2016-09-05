import java.util.ArrayList;

public class p44 {

	public static void main(String[] args) {
		ArrayList<Integer> penNum = new ArrayList<Integer>();
		int a, b;
		int bestD = (int) Math.pow(2, 31) - 1;
		for (int i = 1; i < 1000000; i++) {
			penNum.add(genNum(i));
		}
		for (int i = 1; i < 500000; i++) {
			for (int j = 0; j < i; j++) {
				a = penNum.get(i);
				b = penNum.get(j);
				System.out.println(a + "\t" + b + "\t" + bestD);
				if (penNum.indexOf(Math.abs(a + b)) != -1 && penNum.indexOf(Math.abs(a - b)) != -1) {
					System.out.println(a + "\t" + b + "\t" + bestD);
					if (Math.abs(a - b) < bestD) {
						bestD = Math.abs(a - b);
					}
				}
			}
		}
		System.out.println(bestD);
	}

	public static int genNum(int i) {
		return i * (3 * i - 1) / 2;
	}

}
