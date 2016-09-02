import java.util.ArrayList;

public class p41 {

	public static void main(String[] args) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		primes.add(2);
		int max = 0;
		boolean found;
		for(int i = 3; i < 987654321; i+=2){
			
			found = false;
			for(int cur: primes){
				if(i % cur == 0){
					found = true;
					break;
				}
			}
			if(!found){
				System.out.println(i+"\t"+max);
			}
			if(!found && check(""+i)){
				max = i;
			}
		}
		System.out.println(max);
	}

	public static boolean check(String num) {
		//if (num.length() != 9)
		//	return false;
		ArrayList<Character> found = new ArrayList<Character>();
		while (num.length() > 0) {
			if (num.charAt(0) == '0')
				return false;
			if (found.indexOf(num.charAt(0)) != -1)
				return false;
			found.add(num.charAt(0));
			num = num.substring(1, num.length());
		}
		for(int i = 1; i < found.size()+1; i++){
			//System.out.println((char)('0'+i));
			if(found.indexOf((char)('0'+i)) == -1)
				return false;
		}
		return true;
	}
}
