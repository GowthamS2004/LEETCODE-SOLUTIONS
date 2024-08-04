import java.math.BigInteger;

class Solution {
    public String multiply(String num1, String num2) {
        // Convert the string representations directly to BigIntegers
        BigInteger bigNum1 = new BigInteger(num1);
        BigInteger bigNum2 = new BigInteger(num2);
        
        // Multiply the BigIntegers
        BigInteger result = bigNum1.multiply(bigNum2);
        
        // Convert the result back to a string
        return result.toString();
    }
}
