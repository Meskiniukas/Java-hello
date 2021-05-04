package hello;

import java.util.Scanner;

/**
 *
 * @author tomas
 */
public class TrikampioPlotas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Įvesk trikampio a kraštinės ilgį:");
        double a = sc.nextDouble();
        System.out.println("Įvesk trikampio b kraštinės ilgį:");
        double b = sc.nextDouble();
        System.out.println("Įvesk trikampio c kraštinės ilgį:");
        double c = sc.nextDouble();

        double plotas = trikampioPlotasCalc(a, b, c);

        if (plotas == -1) {
            System.out.println("\nError. Code: " + plotas);
        } else {
            System.out.println("\nTrikampio plotas: " + plotas);
        }
    }

    public static double trikampioPlotasCalc(double a, double b, double c) {

        if (a <= 0 || b <= 0 || c <= 0 || a + b <=c || a + c <= b || b + c <= a) {
            return -1;
        }

        double pp = (a + b + c) / 2;
        double plotas = Math.sqrt(pp * (pp - a) * (pp - b) * (pp - c));

        return plotas;
    }
}
