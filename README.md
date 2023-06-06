# BitManipulationMath
Divide binary numbers (Column division)

This is the solution to the problem on the leetcode -> (29. Divide Two Integers https://leetcode.com/problems/divide-two-integers/ )

I used Array of Bits(BitSet).
For example I have a dividend like 10011011 and in array of Bits it would be:

1001101(1)
array[0] -> true

100110(1)
array[1] -> true

10011(0)
array[2] -> false

1001(1)
array[3] -> true
and so on. 

It means: (longDividend & 1) get the last value 1 or 0;

Next comes the loop that does Column Division:

![image](https://github.com/MykolaLytvynov/BitManipulationMath/assets/91893043/866c7e77-2cd8-4d48-b971-0241f524e1ca)
