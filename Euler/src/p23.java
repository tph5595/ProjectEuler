import java.math.BigInteger;
import java.util.ArrayList;
//Done
public class p23 {

	public static void main(String[] args) {
		BigInteger sum = BigInteger.ZERO;
		ArrayList<Integer> abuns = new ArrayList<Integer>();
		for(int i = 0; i <= 28123; i++){
			if(isAbun(i))
				abuns.add(i);
		}
		boolean found = false;
		for(int i = 0; i <= 28123; i++){
			found = false;
			for(int j = 0; j< abuns.size(); j++){
				if(abuns.indexOf(i-abuns.get(j)) != -1){
					found = true;
					//System.out.println(i);
					break;
				}
				
			}
			if(!found){
				System.out.println(i);
				sum = sum.add(new BigInteger(i+""));
			}
		}
		System.out.println(sum);
	}
	public static boolean isAbun(int num){
		int tmp = 0;
		for(int i = 1; i < num; i++){
			if(num%i == 0){
				tmp +=i;
			}
		}
		if(tmp > num)
			return true;
		return false;
	}
}
