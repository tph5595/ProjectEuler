
public class p5 {

	public static void main(String[] args) {
		int num = 20;
		for(;!isDivis(num); num+=20);
		System.out.println(""+num);
	}
	public static boolean isDivis(int i){
		for(int j = 1; j <= 20; j++){
			if(i%j != 0)
				return false;
		}
		return true;
	}

}
