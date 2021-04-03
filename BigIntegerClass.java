package Bolum_10_Soru_17;

import java.math.BigInteger;

public class BigIntegerClass {
	public static void main(String[] args) {
		
		BigInteger bek = new BigInteger(String.valueOf(Long.MAX_VALUE));
		BigInteger one = BigInteger.ONE;
		
		for (int i = 0; i < 1; i++) {
			bek = bek.add(one);
			if (bigIntegerTamKaremi(bek)) {
				System.out.println(bek);
			}
		}
		System.out.println(bek);
	}
	
	public static boolean bigIntegerTamKaremi(BigInteger bek) {
		for (BigInteger i = BigInteger.ONE; !i.equals(bek.divide(new BigInteger("1000000"))); i = i.add(BigInteger.ONE)) {

			if (bek.equals(i.multiply(i))) {
				return true;
			}
		}
		return false;
	}
}




