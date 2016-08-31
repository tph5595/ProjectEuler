//Done
public class p30 {

	public static void main(String[] args) {
		int sum = 0, curSum, tmp;
		for(int i = 10; i < 1000000; i++){
			curSum = 0;
			tmp = i;
			while(tmp != 0){
				curSum += Math.pow((tmp%10), 5);
				tmp = tmp/10;
			}
			if(curSum == i)
				sum +=curSum;
		}
		System.out.println(sum);

	}

}
