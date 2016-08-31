
public class p17 {
//Done
	//21124
	public static void main(String[] args) {
		/* one two three four five six seven eight nine
		 *  3   3    5    4    4    3    5     5    4
		 */
		//int onesC = 36;
		String onesC[] = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		
		/* ten eleven twelve thirteen fourteen fifteen sixteen seventeen eighteen nineteen twenty thirty forty fifty sixty seventy eighty ninety 
		 * 123 456789 012345 67890123 45678901 2345678 9012345 678901234 56789012 34567890 123456 789012 34567 89012 34567 8901234 567890 123456
		 */
		//int teensC = 70;
		String teensC[] = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
		
		//int tensC = 46;
		String tensC[] = {"twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
		
		/* hundred and
		 * 1234567 890
		 */
		//int hunC = 10+onesC;
		String hunC[] = {"one hundred and", "two hundred and", "three hundred and", "four hundred and", "five hundred and", "six hundred and", "seven hundred and", "eight hundred and", "nine hundred and"};
		
		/* thousand
		 * 12345678
		 */
		//int thoC = 8;
		String thoC = "one thousand";
		
		int total = 0;
		
		//1-9
		for(int i = 0; i < 9; i++){
			System.out.print(onesC[i]+"");
		}
		
		//10-19
		for(int i = 0; i < 10; i++){
			System.out.print(teensC[i]+"");
		}
		
		//20-99
		for(int i = 20; i <= 99; i++){
			System.out.print(tensC[(i/10)-2]+"");
			if(i%10 != 0)
				System.out.print(onesC[i%10-1]+"");
		}
		
		//100-999
		for(int i = 100; i <= 999; i++){
			//System.out.print(i+" ");
			System.out.print(hunC[(i/100)-1]+"");
			if((i/10)%10 == 1)
				System.out.print(teensC[i%10]+"");
			else{
				if((i/10)%10 != 0)
					System.out.print(tensC[((i/10)%10)-2]+"");
				if(i%10 != 0)
					System.out.print(onesC[i%10-1]+"");
			}
		}
		
		//total +=onesC;
		//10-99
		//total += (teensC + (onesC*9)+tensC*10);
		//100-999
		//-30 for the case of no and
		//total += (teensC + (onesC*9)+tensC*10)*10+100*hunC-30;
		//1000
		//total += 3 + thoC;
		//System.out.println(total+"");
	}

}
