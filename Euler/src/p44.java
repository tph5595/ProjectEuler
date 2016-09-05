import java.util.ArrayList;

public class p44 {

	public static void main(String[] args) {
		ArrayList<Integer> penNum = new ArrayList<Integer>();
		int bestD = (int) Math.pow(2, 31) - 1;
		for (int i = 1; i < 1000000; i++) {
			penNum.add(genNum(i));
		}
		for (int i = 1; i < 500000; i++) {
			for (int j = 0; j < i; j++) {
				System.out.println(i+"\t"+j);
				if (penNum.indexOf(penNum.get(i) + penNum.get(j)) != -1 && penNum.indexOf(penNum.get(i) - penNum.get(j)) != -1) {
					System.out.println(penNum.get(i)+"\t"+penNum.get(j)+"\t"+bestD);
					if(penNum.get(i)-penNum.get(j) < bestD){
						bestD = penNum.get(i)-penNum.get(j);
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
