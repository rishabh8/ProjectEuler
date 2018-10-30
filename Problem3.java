
// Program to print all prime factors 
import java.io.*;
import java.lang.Math;
import java.math.BigInteger;

public class Demo {
	// A function to print all prime factors
	// of a given number n
	public static void primeFactors(BigInteger n) {
		// Print the number of 2s that divide n
		while (n.mod(BigInteger.valueOf(2)).equals(BigInteger.valueOf(0))) {
			System.out.print(2 + " ");
			n = n.divide(BigInteger.valueOf(2));
		}

		// n must be odd at this point. So we can
		// skip one element (Note i = i +2)
		BigInteger i;
		for (i = BigInteger.valueOf(3); i.compareTo(Demo.sqrt(n)) <= 0; i = i.add(BigInteger.valueOf(2))) {
			// While i divides n, print i and divide n
			while (n.mod(i).equals(BigInteger.valueOf(0))) {
				System.out.print(i + " ");
				n = n.divide(i);
			}
		}

		// This condition is to handle the case whien
		// n is a prime number greater than 2
		if (n.compareTo(BigInteger.valueOf(2)) == 1)
			System.out.print(n);
	}

	public static BigInteger sqrt(BigInteger n) {
		BigInteger a = BigInteger.ONE;
		BigInteger b = new BigInteger(n.shiftRight(5).add(new BigInteger("8")).toString());
		while (b.compareTo(a) >= 0) {
			BigInteger mid = new BigInteger(a.add(b).shiftRight(1).toString());
			if (mid.multiply(mid).compareTo(n) > 0)
				b = mid.subtract(BigInteger.ONE);
			else
				a = mid.add(BigInteger.ONE);
		}
		return a.subtract(BigInteger.ONE);
	}

	public static void main(String[] args) {
		BigInteger n = BigInteger.valueOf(60086951475143L);
		primeFactors(n);
		System.out.println();
	}
}
