import java.util.ArrayList;
//Done 5777
public class p46 {

	public static void main(String[] args) {
		ArrayList<Integer> primes = genPrimes(10000);
		int a = 0;
		boolean found;
		for (int i = 3;; i += 2) {
			found = false;
			if (primes.indexOf(i) == -1) {
				for (int j = 0; primes.get(j) < i; j++) {
					
					if(test(i, primes.get(j))){
						found = true; 
						break;
					}
				}
				if(!found){
					System.out.println(i);
					//if(a ==4)
						return;
					//a++;
				}
			}
		}
	}

	public static ArrayList<Integer> genPrimes(int numPrimes) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		primes.add(2);
		boolean found = false;
		for (int i = 3; primes.size() < numPrimes; i += 2) {
			found = false;
			for (int j = 0; j < primes.size(); j++) {
				if (i % primes.get(j) == 0) {
					found = true;
					break;
				}
			}
			if (!found) {
				primes.add(i);
			}
		}
		return primes;
	}

	public static boolean test(int num, int add) {
		System.out.println(num+"\t"+add+"\t1");
		if(num == add+(2*Math.pow(1, 2))){
			System.out.println("T");
			return true;
		}
		System.out.println(num+"\t"+add+"\t2");
		if(num == add+(2*Math.pow(2, 2))){
			System.out.println("T");
			return true;
		}
		for(int i = 0; 2*Math.pow(i, 2) <= num-add; i++ ){
			System.out.println(num+"\t"+add+"\t"+i);
			if(num == add+(2*Math.pow(i, 2))){
				System.out.println("T");
				return true;
			}
		}
		return false;
	}

}
