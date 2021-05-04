package hello;

import java.util.Scanner;

/**
 *
 * @author tomas
 */
public class MetodaiByAlius {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        System.out.println("1 sk:");
        int sk1 = sc.nextInt();
        System.out.println("2 sk:");
        int sk2 = sc.nextInt();
        System.out.println("3 sk:");
        int sk3 = sc.nextInt();
        System.out.println("4 sk:");
        int sk4 = sc.nextInt();
 
        int suma1 = skaiciuSuma(sk1, sk2);
        System.out.println(suma1);
        int suma2 = skaiciuSuma(sk3, sk4);
        System.out.println(suma2);
 
    }
 
    public static int skaiciuSuma(int s1, int s2) {
        if (s1 > s2) {
            int tmp = s1;
            s1 = s2;
            s2 = tmp;
        }
        int suma = 0;
        for (int i = s1; i <= s2; i++) {
            suma += i;
        }
        return suma;
    }
    
}
