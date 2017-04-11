import java.util.*;
import java.math.*;

public class BigFactorial {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java BigFactorial <number>");
            return;
        }
        BigInteger fac = new BigInteger(args[0]);
        for (int i = 2; i <= Integer.parseInt(args[0]); i++) {
            fac = fac.multiply(BigInteger.valueOf(i));
        }
        System.out.println(fac);
    }
}
