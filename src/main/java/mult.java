import java.math.BigInteger;

public class mult {
    public BigInteger multiplyBigInt(String[] args){
        BigInteger A = new BigInteger(args[0]);
        BigInteger B = new BigInteger(args[1]);
        BigInteger multiply;
        return multiply = A.multiply(B);
    }
    public String multiply(String[] args){
        String A = args[0];
        String B = args[1];
        StringBuffer result = new StringBuffer();
        int value [] = new int[A.length() + B.length() ];
        if(A.length() >=B.length()) {
            for (int i = B.length()-1; i >= 0; i--){
                for (int j = A.length()-1; j >= 0; j--) {
                    int C = (B.charAt(i) - '0') * (A.charAt(j) - '0');
                    int foo1 = i + j;
                    int foo2 = i + j + 1;
                    int sum = C + value[foo2];
                    value[foo1] += sum / 10;
                    value[foo2] = sum % 10;
                }
            }
            for (int i : value) {
                if(result.length() != 0 || i != 0)
                    result.append(i);
            }
        }
        return result.toString();
    }
}
