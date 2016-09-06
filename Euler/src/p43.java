import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
//done
//I know i should be using string builder but eh 
//its only running one time so i think its fine haha
public class p43 {

	public static void main(String[] args) {
		BigInteger total = BigInteger.ZERO;
		ArrayList<Integer> master = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			master.add(i);
		}
		String cur;
		for (int i = 1; i < 10; i++) {
			cur = "" + master.get(i);
			master.remove(i);
			for (int b = 0; b < 9; b++) {
				cur += master.get(b);
				master.remove(b);
				for (int c = 0; c < 8; c++) {
					cur += master.get(c);
					master.remove(c);
					for (int d = 0; d < 7; d++) {
						cur += master.get(d);
						master.remove(d);
						for (int e = 0; e < 6; e++) {
							cur += master.get(e);
							master.remove(e);
							for (int f = 0; f < 5; f++) {
								cur += master.get(f);
								master.remove(f);
								for (int g = 0; g < 4; g++) {
									cur += master.get(g);
									master.remove(g);
									for (int h = 0; h < 3; h++) {
										cur += master.get(h);
										master.remove(h);
										for (int j = 0; j < 2; j++) {
											cur += master.get(j);
											master.remove(j);
											for (int k = 0; k < 1; k++) {
												cur += master.get(k);
												master.remove(k);
												if (testNum(cur)) {
													total = total.add(new BigInteger(cur));
												}
												System.out.println(cur + "\t" + total);
											}
											master.add(Integer.parseInt(cur.substring(cur.length()-2, cur.length()-1)));
											master.add(Integer.parseInt(cur.substring(cur.length()-1, cur.length())));
											Collections.sort(master);
											cur = cur.substring(0, cur.length() - 2);
										}
										master.add(Integer.parseInt(cur.substring(cur.length()-1, cur.length())));
										Collections.sort(master);
										cur = cur.substring(0, cur.length() - 1);
									}
									master.add(Integer.parseInt(cur.substring(cur.length()-1, cur.length())));
									Collections.sort(master);
									cur = cur.substring(0, cur.length() - 1);
								}
								master.add(Integer.parseInt(cur.substring(cur.length()-1, cur.length())));
								Collections.sort(master);
								cur = cur.substring(0, cur.length() - 1);
							}
							master.add(Integer.parseInt(cur.substring(cur.length()-1, cur.length())));
							Collections.sort(master);
							cur = cur.substring(0, cur.length() - 1);
						}
						master.add(Integer.parseInt(cur.substring(cur.length()-1, cur.length())));
						Collections.sort(master);
						cur = cur.substring(0, cur.length() - 1);
					}
					master.add(Integer.parseInt(cur.substring(cur.length()-1, cur.length())));
					Collections.sort(master);
					cur = cur.substring(0, cur.length() - 1);
				}
				master.add(Integer.parseInt(cur.substring(cur.length()-1, cur.length())));
				Collections.sort(master);
				cur = cur.substring(0, cur.length() - 1);
			}
			master.add(Integer.parseInt(cur.substring(cur.length()-1, cur.length())));
			Collections.sort(master);
			cur = cur.substring(0, cur.length() - 1);
		}
	}

	public static boolean testNum(String num) {
		if (Integer.parseInt(num.substring(1, 4)) % 2 != 0) {
			return false;
		}
		if (Integer.parseInt(num.substring(2, 5)) % 3 != 0) {
			return false;
		}
		if (Integer.parseInt(num.substring(3, 6)) % 5 != 0) {
			return false;
		}
		if (Integer.parseInt(num.substring(4, 7)) % 7 != 0) {
			return false;
		}
		if (Integer.parseInt(num.substring(5, 8)) % 11 != 0) {
			return false;
		}
		if (Integer.parseInt(num.substring(6, 9)) % 13 != 0) {
			return false;
		}
		if (Integer.parseInt(num.substring(7, 10)) % 17 != 0) {
			return false;
		}
		return true;
	}

}
