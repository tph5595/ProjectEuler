import java.math.BigInteger;
//Done
public class p14 {
	static BigInteger one    = new BigInteger("1");
	static BigInteger two    = new BigInteger("2");
	static BigInteger three  = new BigInteger("3");
	
	public static void main(String[] args) {
		int longest = 0;
		int maxLength = 0, curLength = 0;
		BigInteger num;
		BigInteger zero = new BigInteger("0");
		
		for(int i = 13; i < 1000000; i++){
			num =  new BigInteger(i+"");
			curLength = 0;
			while(num.compareTo(one) != 0){		// && num != 113382){
				System.out.println(num+"\t"+i+"\t"+longest);
				if(num.mod(two).compareTo(zero) == 0)
					num = even(num);
				else
					num = odd(num);
				curLength++;
			}
			if(curLength > maxLength){
				maxLength = curLength;
				longest = i;
				//System.out.println(longest);
			}
			//System.out.println(i+"\t\t"+longest);
		}
		System.out.println("done");

	}
	public static BigInteger even(BigInteger in){
		return in.divide(two);
	}
	public static BigInteger odd(BigInteger in){
		return in.multiply(three).add(one);
	}

}
