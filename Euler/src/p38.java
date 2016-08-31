import java.util.ArrayList;

public class p38 {

	public static void main(String[] args) {
		int cnt = 2, max = 0, tmp;
		String cur = "";
		for (int i = 2; i <= 9999; i++) {
			cnt = 2;
			while (cur.length() < 10) {
				System.out.println(i+"\t"+cnt);
				cur = "";
				for (int j = 0; j <= cnt; j++) {
					cur = cur + (i * j);
				}
				if (check(cur)) {
					tmp = Integer.parseInt(cur);
					if (tmp > max) {
						max = tmp;
						System.out.println(max);
					}
				}
				cnt++;
			}
			cur = "";
		}
		System.out.println(max);
	}

	public static boolean check(String num) {
		if(num.length() != 10)
			return false;
		ArrayList<Character> found = new ArrayList<Character>();
		while(num.length() > 0){
			if(found.indexOf(num.charAt(0)) != -1)
				return false;
			found.add(num.charAt(0));
			num = num.substring(1,num.length());
		}
		return true;
	}

}
