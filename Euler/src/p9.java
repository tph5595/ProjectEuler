//Done
public class p9 {
	public static void main(String[] args) {
		int a = 1, b = 2;
		for(int c = 997; c > 333; c--){
			for(a = 1, b = 1000-c-a; b>a; b--, a++){
				System.out.println("a = "+a+" b = "+b+" c = "+c);
				if(Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2)) == c){
					System.out.println("SOLVED: a = "+a+" b = "+b+" c = "+c);
					System.exit(0);
				}
			}
		}
	}
}