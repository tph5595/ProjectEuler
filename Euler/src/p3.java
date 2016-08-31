import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//Done
public class p3 {

	public static void main(String[] args) {
		//known factors: 3, 7, 7, 11, 163
		int max = 163; 
		int num = 2279657;
		//int i= 0;
		int line = 0;
		Scanner primes = null;
		try {
			primes = new Scanner(new File("/Users/taylor/Documents/FunTimes/Euler/bin/primes_newline.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.exit(0);
		}
		while(primes.hasNextLine()){
			line = Integer.parseInt(primes.nextLine());
			if(num%line==0){
				System.out.println(""+line);
				max = line;
				num = num/line;
				//i = -1;
				System.out.println(""+num);
			}else{
				
			}
			//i++;
		}
		System.out.println(""+max);
	}

}