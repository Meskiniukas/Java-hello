package hello;

import java.util.Scanner;

/**
 *
 * @author tomas
 */
public class AliausSPS {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int pasirinkimas;
        do {
            System.out.println("1. Akmuo");
            System.out.println("2. Popierius");
            System.out.println("3. Zirkles");
            System.out.println("0. Pabaiga");
            pasirinkimas = sc.nextInt();
            if (pasirinkimas < 0 || pasirinkimas > 3) {
                System.out.println("Idiote, ismok naudotis klaviatura !!!");
            } else if (pasirinkimas > 0) {
                int kp = (int) (Math.random() * 3 + 1);
                switch (kp) {
                    case 1:
                        System.out.println("Kompiterio pasirinkimas: Akmuo");
                        break;
                    case 2:
                        System.out.println("Kompiterio pasirinkimas: Popierius");
                        break;
                    case 3:
                        System.out.println("Kompiterio pasirinkimas: Zirkles");
                        break;
                }
                if (pasirinkimas == kp) {
                    System.out.println("Lygiosios");
                } else if (pasirinkimas == 1) {
                    if (kp == 2) {
                        System.out.println("Laimejo kompiuteris");
                    } else {
                        System.out.println("Laimejo zaidejas");
                    }
                } else if (pasirinkimas == 2) {
                    if (kp == 3) {
                        System.out.println("Laimejo kompiuteris");
                    } else {
                        System.out.println("Laimejo zaidejas");
                    }
                } else {
                    if (kp == 1) {
                        System.out.println("Laimejo kompiuteris");
                    } else {
                        System.out.println("Laimejo zaidejas");
                    }
                }
            }
        } while (pasirinkimas != 0);

    }
}
