//Done
public class p28 {
	public static void main(String[] args) {
		int size = 3;
		int corner = 1;
		int sum = 1;
		int cur = 1;
		int moveBy = 2;
		while (size < 1002) {
			if (corner % 5 == 0) {
				corner = 1;
				moveBy += 2;
				size += 2;
			}
			if (size < 1002) {
				cur += moveBy;
				System.out.println(cur + "\t" + corner);
				corner++;
				sum += cur;
			}
		}
		System.out.println(sum);
	}
}
