package mykola;

import java.util.BitSet;

public class MathBitManipulator {

    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        boolean negative = dividend < 0 != divisor < 0;

        long longDividend = convertIntToAbsoluteLong(dividend);
        long longDivisor = convertIntToAbsoluteLong(divisor);
        if (longDivisor == 0 || longDivisor > longDividend) return 0;

        BitSet bitSet = getBitSetfromNumber(longDividend);
        int result = 0;
        long temp = 1;
        for (int j = bitSet.length() - 2; j >= -1; j--) {
            while (temp < longDivisor) {
                if (j == -1) return negative ? -result<<1 : result<<1;
                temp<<=1;
                result<<=1;
                if (bitSet.get(j)) {
                    temp|=1;
                }
                j--;
            }
            result<<=1;
            result|=1;

            temp = temp - longDivisor;
            if (j >= 0) {
                temp <<= 1;
                if (bitSet.get(j)) {
                    temp |= 1;
                }
            }
        }

        return negative ? -result : result;
    }

    private BitSet getBitSetfromNumber(long number) {
        BitSet bitSet = new BitSet();

        int i = 0;
        while (number > 0) {
            bitSet.set(i++, (number & 1) == 1 ? true : false);
            number>>=1;
        }
        return bitSet;
    }

    private long convertIntToAbsoluteLong(int number) {
        return number == Integer.MIN_VALUE ? (long) Integer.MAX_VALUE+1 : Math.abs(number);
    }
}
