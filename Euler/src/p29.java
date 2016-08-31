import java.math.BigInteger;
import java.util.ArrayList;
//Done
public class p29 {

	public static void main(String[] args) {
		ArrayList<BigInteger> Unums = new ArrayList<BigInteger>();
		BigInteger cur;
		
		for(int a = 2; a <= 100; a++){
			for(int b = 2; b <= 100; b++){
				cur = new BigInteger(a+"").pow(b);
				if(Unums.indexOf(cur) == -1){
					Unums.add(cur);
				}
			}
		}
		System.out.println(Unums.size());
	}

}
