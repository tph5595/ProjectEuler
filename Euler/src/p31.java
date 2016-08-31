
public class p31 {
//Done
	public static void main(String[] args) {
		int cnt = 0;
		int sum = 0;
		for (int h2 = 0; h2 < 2; h2++) {
			for (int h = 0; h < 3; h++) {
				for (int fif = 0; fif < 5; fif++) {
					for (int twen = 0; twen < 11; twen++) {
						for (int ten = 0; ten < 21; ten++) {
							for (int fiv = 0; fiv < 41; fiv++) {
								for (int two = 0; two < 101; two++) {
									for (int one = 0; one < 201; one++) {
										sum = (h2 * 200) + (h * 100) + (fif * 50) + (twen * 20) + (ten * 10) + (fiv * 5)
												+ (two * 2) + one;
										if (sum == 200) {
											cnt++;
											System.out.println(sum);
										}
									}
								}
							}
						}
					}
				}
			}
		}
		System.out.println(cnt);

	}

}
