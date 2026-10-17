import java.math.BigInteger;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger n = in.nextBigInteger(), k = in.nextBigInteger(), l = in.nextBigInteger();
        BigInteger side = l.multiply(BigInteger.TWO);
        BigInteger area = side.multiply(side);
        BigInteger overlap = side.subtract(k).max(BigInteger.ZERO);
        overlap = overlap.multiply(overlap);
        System.out.println(n.multiply(area).subtract(n.subtract(BigInteger.ONE).multiply(overlap)));
    }
}
