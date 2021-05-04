package hello;

/**
 *
 * @author tomas
 */
public class Faktorialas {

    public static void main(String[] args) {

        System.out.println(fakt(20));   
        
    }
    
    
    public static long fakt(long sk) {
        if (sk < 0) {
            return -1;
        }
        if (sk == 0) {
            return 1;
        }
        return sk * fakt(sk - 1);
    }
}
