//Done
public class p2 {

	public static void main(String[] args) {
		int b1 = 1,  b2 = 1, tmp;
		int sum = 0;
		while(b1 < 4000000){
			tmp = b1 + b2;
			if(tmp%2 == 0)
				sum +=tmp;
			b2 = b1;
			b1 = tmp;
		}
		System.out.println(""+sum);
	}

}
