package hello;

/**
 *
 * @author tomas
 */
public class Goldbach {

    public static void main(String[] args) {

        for (int i = 4; i <= 2000; i += 2) {
            if (i == 4) {
                System.out.println("4 = 2 + 2;");
            } else {
                for (int sk = 3; sk <= i - 3; sk += 2) {
                    if (isPrime(sk) && isPrime(i - sk)) {
                        System.out.println(i + " = " + sk + " + " + (i - sk) + ";");
                        break;
                    }
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
