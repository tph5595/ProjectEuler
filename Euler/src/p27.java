import java.util.ArrayList;
//Done
public class p27 {

	public static void main(String[] args) {
		int maxP = 0, maxLen = 0;
		int curLen = 0, n = 0;
		int cur;
		ArrayList<Integer> primes = new ArrayList<Integer>();
		primes.add(2);
		makePrimes(primes);
		
		boolean prime = true;
		for(int a = -999; a < 1000; a++){
			for(int b = -1000; b <= 1000; b++){
				//System.out.println(a+"\t"+b);
				n = 0;
				prime = true;
				while(prime){
					prime = false;
					cur = (int) ((Math.pow(n, 2)+(a*n)+b));
					
					while(primes.get(primes.size()-1) < cur){
						//System.out.println(primes.get(primes.size()-1)+"\t"+cur);
						makePrimes(primes);
					}
					if(primes.indexOf(cur) != -1){
						prime = true; 
					}else{
						prime = false;n--;
					}
					n++;
				}
				if(n > maxLen){
					maxLen = n;
					maxP = a*b;
					System.out.println(a+"\t"+b+"\t"+maxLen+"\t"+maxP);
				}
				
			}
			//System.out.println(maxP);
		}
	}
	public static void makePrimes(ArrayList<Integer> primes){
		int num = primes.get(primes.size()-1)+1;
		boolean found = false;
		for(int i = 0; i < 10; i++){
			//System.out.println(num);
			while(!found){
				for(int j = 0; j < primes.size(); j++){
					if(num%primes.get(j) == 0){
						//primes.add(num);
						found = true;
					}
				}
				if(!found){
					primes.add(num);
					//System.out.println(num);
					break;
				}else{
					found = false;
				}num++;
				
			}
			found = false;
		}
	}

}
