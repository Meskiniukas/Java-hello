package hello;

/**
 *
 * @author tomas
 */
public class Fibonaci {

    public static void main(String[] args) {
       fib (1, 1, 500);
    }
    
    public static void fib(long s1, long s2, long max) {
        
        System.out.print(s1 + " ");
        if (s1 + s2 > max) {
            System.out.print(s2 + " ");
        } else {
            fib(s2, s1 + s2, max);
        }
    }
}
