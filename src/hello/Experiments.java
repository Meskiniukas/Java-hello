package hello;

/**
 *
 * @author tomas (pagal Astą)
 */
public class Experiments {

    public static void main(String[] args) {

        for (int i = 1; i < 1000; i++) {
            if(isPrime(i)) {
                System.out.print(i + " ");
            }
        }
//        for (int i = 2; i < 100; i++) {
//            System.out.println("529 : " + i + " = " + 529. / i) ;
//        }
    
    }
    
    public static boolean isPrime(int sk) {
        
        if (sk < 2) {
            return false;
        }
        for (int i = 2; i <= sk / 2; i++) {
            if (sk % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    
//    Astos:

//    public static boolean isPrime(int n) {
//        int i, m;
//        m = n / 2;
//        if (n == 0 || n == 1) {
//            return false;
//        } else {
//            for (i = 2; i <= m; i++) {
//                if (n % i == 0) {
//                    return false;
//                }
//            }
//            return true;
//        }
//    }
    

//      Mano:

//        public static boolean isPrime(int sk) {
//        
//        boolean isPrime = false;
//        
//        if (sk > 19) {
//            isPrime = (sk % 2 != 0 && sk % 3 != 0 && sk % 5 != 0 && sk % 7 != 0 && sk % 11 != 0 && sk % 13 != 0 && sk % 17 != 0 && sk % 19 != 0);
//        }
//        switch (sk) {
//            case 19, 17, 13, 11, 7, 5, 3, 2 -> isPrime = true;
//        }
//        return isPrime;
//    }
    
}
