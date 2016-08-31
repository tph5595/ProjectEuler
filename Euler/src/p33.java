
public class p33 {
//Done
	public static void main(String[] args) {
		int t = 1, b = 1;
		for (int i = 10; i < 100; i++) {
			for (int j = 10; j < 100; j++) {
				if (can(i, j)) {
					System.out.println(i + "/" + j);
					t *= i;
					b *= j;
				}
			}
		}
		System.out.println(t + "/" + b);
		System.out.println(can(49,98));
	}

	public static boolean can(double a, double b) {
		//System.out.println(a/10+"\t"+a%10+"\t"+b/10+"\t"+b%10);
		if (Math.floor(a / 10) == Math.floor(b / 10)) {
			//System.out.println("1: "+a+"\t"+b);
			if (a / b == (a % 10) / (b % 10) && a / b < 1)
				return true;
		} else if (Math.floor(a / 10) == b % 10 && a / b < 1) {
			//System.out.println("2: "+a+"\t"+b);
			if (a / b == (a % 10) / (Math.floor(b / 10)))
				return true;
		} else if (a % 10 == Math.floor(b / 10) && a / b < 1) {
			//System.out.println("3: "+a+"\t"+b);
			if (a / b == (Math.floor(a / 10)) / (b % 10))
				return true;
		} else if (a % 10 == b % 10 && b % 10 != 0 && a / b < 1) {
			//System.out.println("4: "+a+"\t"+b);
			if (a / b == (Math.floor(a / 10)) / (Math.floor(b / 10)))
				return true;
		}
		return false;
	}
}
