package hello;

/**
 *
 * @author tomas
 */
public class Goldbach {

    public static void main(String[] args) {

        boolean primesum = false;
        for (int i = 4; i <= 2000; i += 2) {
            for (int sk = 2; sk <= i - 2; sk++) {
                if (primesum) {
                    primesum = false;
                    break;
                }
                if (isPrime(sk) && isPrime(i - sk)) {
                    System.out.println(i + " = " + sk + " + " + (i - sk) + ";");
                    primesum = i != 4;
                }
            }
        }
    }

    public static boolean isPrime(int sk) {

        if (sk < 2) {
            return false;
        }
        if (sk == 2) {
            return true;
        }
        if (sk % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= sk / 2; i += 2) {
            if (sk % i == 0) {
                return false;
            }
        }
        return true;
    }

}
