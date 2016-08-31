import java.io.*;
import java.util.*;
import java.math.*;

public class pp002 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int max = sc.nextInt();
        BigInteger sum = BigInteger.ZERO;
        BigInteger b1  = BigInteger.ONE;
        BigInteger b2  = BigInteger.ONE;
        BigInteger tmp;
        BigInteger num;
        for(int i = 0; i < max; i++){
            num = sc.nextBigInteger();
            b1 = BigInteger.ONE;
            b2 = BigInteger.ONE;
            //int b1 = 1,  b2 = 1, tmp;
            //int sum = 0;
            sum = BigInteger.ZERO;
            while(b1.compareTo(num) < 0){
                if(b1.mod(new BigInteger(2+"")).compareTo(BigInteger.ZERO) == 0){
                    sum = sum.add(b1);
                   // System.out.println(b1);
                }
                tmp = b1.add(b2);
                
                b2 = b1;
                b1 = tmp;
            }
            System.out.println(""+sum);
        }
    }
}