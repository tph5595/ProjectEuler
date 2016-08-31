import java.math.BigInteger;

public class p24 {

	public static void main(String[] args) {
		int num[] = {0,1,2};
		int working[] = new int[3];
		BigInteger all[] = new BigInteger[6];
		int idx = 0;
		BigInteger cur;
		for(int i = 0; i < num.length; i++){
			working = num;
			cur = new BigInteger(num[i]+"");
			cur = cur.multiply(BigInteger.TEN);
			working[i] = -1;
			//System.out.println(i+" i");
			for(int j = 0, cnt2 = 0; cnt2 < 2; cnt2++, j++){
				while(working[j] == -1)
					j++;
				cur = cur.add(new BigInteger(working[j]+""));
				cur = cur.multiply(BigInteger.TEN);
				working[j] = -1;
				//System.out.println(j+" j");
				for(int k = 0; k < 1; k++){
					//System.out.println(k+" k before");
					while(working[k] == -1)
						k++;
					//System.out.println(k+" k");
					cur = cur.add(new BigInteger(working[k]+""));
					//cur = cur.multiply(BigInteger.TEN);
					all[idx] = cur;
					idx++;
					System.out.println(cur);
					cur = cur.divide(BigInteger.TEN);
				}
				working[j] =j;
				//cur = cur.divide(BigInteger.TEN);
			}
			working[i] = i;
			cur = cur.divide(BigInteger.TEN);
		}
	}

}
