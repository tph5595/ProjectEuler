//Done
public class p39 {

	public static void main(String[] args) {
		int max = 0, curNum;
		double tmp;
		for (int i = 0; i <= 1000; i++) {
			curNum = 0;
			for (int k = 1; k < i; k++) {
				for (int j = 1; j < i / 2; j++) {
					tmp = Math.sqrt(Math.pow((k * 1.0f), 2) + Math.pow((j * 1.0f), 2));
					if ((tmp + k + j) == (double) i) {
						//System.out.println("\t" + k + "\t" + j + "\t" + tmp);
						curNum++;
					}
				}
			}
			curNum /=2;
			System.out.println(i + "\t" + curNum + "\t" + max);
			if (curNum > max)
				max = curNum;
		}
	}

}
