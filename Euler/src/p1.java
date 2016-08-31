//Done
public class p1 {

	public static void main(String[] args) {
		int sum = 0;
		int s = 0;
		for(int i = 0; i < 1000; i++){
			if(i%5 == 0 || i%3 == 0)
				s +=i;
		}
		System.out.println(""+(s-sum));
	}

}
