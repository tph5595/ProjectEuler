import java.util.ArrayList;
//Done
public class p7 {

	public static void main(String[] args) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		primes.add(2);
		int size = 1;
		int i = 2;
		int last = 1;
		boolean found = false;
		while(size != 10001){
			found = false;
			i++;
			for(int j = 0; j < size; j++){
				if(i%primes.get(j) == 0){
					//System.out.println(i+"->"+primes.get(j));
					found = true;
					break;
				}
			}
			if(!found){
				primes.add(i);
				size++;
				last = i;
			}
		}
		System.out.println(""+last);
	}

}
