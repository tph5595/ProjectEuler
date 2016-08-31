//Done
public class p4 {

	public static void main(String[] args) {
		int i, j, max = 0;
		for(i = 998, j = 999;i > 99; j-- ){
			if(isPal(i*j)){
				System.out.println((i*j)+" "+i+" "+j);
				if(i*j > max)
					max = i*j;
			}
			if(j == 99){
				j = 999;
				i--;
			}
		}
		System.out.println("max = " + max);

	}
	public static boolean isPal(int i){
		int t1 = i%10, t2 = i/100000;
		//System.out.println("t1 = "+t1+" t2 = "+t2);
		if(t1 == t2){
			t1 = (i%100)/10;
			int t3 = i/10000-t2*10; 
			//System.out.println("t1 = "+t1+" t3 = "+t3);
			if(t1 == t3){
				t1 = (i%1000)/100;
				int t4 = i/1000-t2*100-t3*10;
				//System.out.println("t1 = "+t1+" t4 = "+t4);
				if(t1 == t4)
					return true;
			}
		}
		return false;
	}

}
