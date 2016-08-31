import java.util.ArrayList;

public class p21 {

	public static void main(String[] args) {
		int tmp = 0;
		//ArrayList<Integer> found = new ArrayList<Integer>();
		for(int j = 1; j < 10000; j++){
			if(j == sumDiv(sumDiv(j)) && j!= sumDiv(j)){
				
				tmp+=j;
			}
		}
		System.out.println(tmp);

	}
	public static int sumDiv(int num){
		int tmp = 0;
		for(int i = 1; i < num; i++){
			if(num%i == 0){
				tmp +=i;
			}
		}
		return tmp;
	}

}
