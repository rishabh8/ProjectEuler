import java.util.*;
import java.io.*;
import java.math.*;

public class Demo {

	public static void main(String[] args) {

		try {
			ArrayList<BigInteger> arr = new ArrayList<BigInteger>();

			BigInteger sum = BigInteger.valueOf(0);
			long n = 100;
			BigInteger t1 = BigInteger.valueOf(0);
			BigInteger t2 = BigInteger.valueOf(1);

			for (long i = 1; i <= n; i++) {
				//System.out.println(t1);
				sum = t1.add(t2);
				t1 = t2;
				t2 = sum;

				if (sum.mod(BigInteger.valueOf(2)).equals(BigInteger.valueOf(0))) {
					if(sum.compareTo(BigInteger.valueOf(4000000)) ==-1){
						arr.add(sum);
					}
					
				}
			}
			System.out.println(arr);
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
