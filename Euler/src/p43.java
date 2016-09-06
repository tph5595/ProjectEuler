import java.util.ArrayList;
//I know i should be using string builder but eh 
//its only running one time so i think its fine haha
public class p43 {

	public static void main(String[] args) {
		int total = 0;
		ArrayList<Integer> master = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			master.add(i);
		}
		String cur;
		for(int i = 1; i < 9; i++){
			cur = ""+master.get(i);
			for(int b = 0; b < 9; b++){
				cur+=master.get(b);
				for(int c = 0; c < 8; c++){
					cur+=master.get(c);
					for(int d = 0; d < 7; d++){
						cur+=master.get(d);
						for(int e = 0; e < 6; e++){
							cur+=master.get(e);
							for(int f = 0; f < 5; f++){
								cur+=master.get(f);
								for(int g = 0; g < 4; g++){
									cur+=master.get(g);
									for(int h = 0; h < 3; h++){
										cur+=master.get(h);
										for(int j = 0; j < 2; j++){
											cur+=master.get(j);
											for(int k = 0; k < 1; k++){
												cur+=master.get(k);
												if(testNum(cur)){
													total++;
												}
												System.out.println(cur+"\t"+total);
											}
											cur = cur.substring(cur.length()-2);
										}
										cur = cur.substring(cur.length()-1);
									}
									cur = cur.substring(cur.length()-1);
								}
								cur = cur.substring(cur.length()-1);
							}
							cur = cur.substring(cur.length()-1);
						}
						cur = cur.substring(cur.length()-1);
					}
					cur = cur.substring(cur.length()-1);
				}
				cur = cur.substring(cur.length()-1);
			}
		}
	}
	public static boolean testNum(String num){
		if(num.substring(1, )){
			
		}
		return true;
	}

}
