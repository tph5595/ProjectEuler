
public class p6 {

	public static void main(String[] args) {
		long s1 = 0, s2 = 0;
		for(int i = 0; i <= 100; i++){
			s1 = (long) (s1+Math.pow(i, 2));
			s2+=i;
		}
		long dif = (long) (Math.pow(s2, 2)-s1);
		System.out.println(""+dif);
	}

}
