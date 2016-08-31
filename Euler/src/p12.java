//Done
public class p12 {

	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		int divCnt = 0;
		int maxDiv = 0;
		while(divCnt < 500){
			divCnt = 0;
			sum += ++i;
			for(int j = 1; j <= sum; j++){
				if(sum%j == 0){
					divCnt++;
				}
			}
			if(divCnt > maxDiv)
				maxDiv = divCnt;
			if(divCnt > 100)
				System.out.println(sum+"\t"+divCnt+"\t\t"+maxDiv);
		}
	}

}
