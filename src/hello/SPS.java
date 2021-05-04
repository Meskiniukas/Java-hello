package hello;

import java.util.Scanner;

/**
 *
 * @author tomas
 */
public class SPS {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int menu = -1;
        int rounds;
        String menurez = "";
        String menurezpc2 = "";
        String laimetojas = "";

        while (menu != 0) {
            System.out.println("******** ******** ******** ********\nŽaidimo meniu:\n\n1. Akmuo\n2. Popierius\n3. Žirklės\n\n4. Sužaisti PC1 <--> PC2\n\n0: PABAIGA\n");
            menu = sc.nextInt();
            if (menu < 0 || menu > 4) {
                System.out.println("Tamsta esate mulkis!\n\n\n");
            }
            int pc2 = (int) (Math.random() * 3 + 1);
            switch (pc2) {
                case 1 ->
                    menurezpc2 = "Akmuo";
                case 2 ->
                    menurezpc2 = "Popierius";
                case 3 ->
                    menurezpc2 = "Žirklės";
            }
            switch (menu) {
                case 1 -> {
                    menurez = "Akmuo";
                    switch (pc2) {
                        case 1 ->
                            laimetojas = "Lygiosios";
                        case 2 ->
                            laimetojas = "PC";
                        case 3 ->
                            laimetojas = "Žaidėjas";
                    }
                }
                case 2 -> {
                    menurez = "Popierius";
                    switch (pc2) {
                        case 1 ->
                            laimetojas = "Žaidėjas";
                        case 2 ->
                            laimetojas = "Lygiosios";
                        case 3 ->
                            laimetojas = "PC";
                    }
                }
                case 3 -> {
                    menurez = "Žirklės";
                    switch (pc2) {
                        case 1 ->
                            laimetojas = "PC";
                        case 2 ->
                            laimetojas = "Žaidėjas";
                        case 3 ->
                            laimetojas = "Lygiosios";
                    }
                }
                case 4 -> {
                    System.out.println("ŽAIDŽIA: PC1 <--> PC2");
                    System.out.println("Kiek partijų sužaisti PC1 <--> PC2 ?\n");
                    rounds = sc.nextInt();
                    int equality = 0;
                    int countpc1 = 0;
                    int countpc2 = 0;
                    int countpc1Stone = 0;
                    int countpc1Paper = 0;
                    int countpc1Scissors = 0;
                    int countpc2Stone = 0;
                    int countpc2Paper = 0;
                    int countpc2Scissors = 0;
                    for (int i = 1; i <= rounds; i++) {
                        int pc1 = (int) (Math.random() * 3 + 1);
                        pc2 = (int) (Math.random() * 3 + 1);
                        switch (pc1) {
                            case 1 -> {
                                countpc1Stone++;
                                switch (pc2) {
                                    case 1 -> {
                                        countpc2Stone++;
                                        equality++;
                                    }
                                    case 2 -> {
                                        countpc2Paper++;
                                        countpc2++;
                                    }
                                    case 3 -> {
                                        countpc2Scissors++;
                                        countpc1++;
                                    }
                                }
                            }
                            case 2 -> {
                                countpc1Paper++;
                                switch (pc2) {
                                    case 1 -> {
                                        countpc2Stone++;
                                        countpc1++;
                                    }
                                    case 2 -> {
                                        countpc2Paper++;
                                        equality++;
                                    }
                                    case 3 -> {
                                        countpc2Scissors++;
                                        countpc2++;
                                    }
                                }
                            }
                            case 3 -> {
                                countpc1Scissors++;
                                switch (pc2) {
                                    case 1 -> {
                                        countpc2Stone++;
                                        countpc2++;
                                    }
                                    case 2 -> {
                                        countpc2Paper++;
                                        countpc1++;
                                    }
                                    case 3 -> {
                                        countpc2Scissors++;
                                        equality++;
                                    }
                                }
                            }
                        }
                    }
                    System.out.println("Rezultatas:\n");
                    System.out.println("PC1 laimėjo: " + countpc1 + " kartų; PC2 laimėjo: " + countpc2 + " kartų; Lygiosios: " + equality + " kartų.\n");
                    System.out.println("PC1:\nAkmuo: " + countpc1Stone + "\nPopierius: " + countpc1Paper + "\nŽirklės: " + countpc1Scissors + "\n\nPC2:\nAkmuo: " + countpc2Stone + "\nPopierius: " + countpc2Paper + "\nŽirklės: " + countpc2Scissors + "\n\n");
                }
            }
            if (menu == 1 || menu == 2 || menu == 3) {
                System.out.println("Žaidėjas: " + menurez + "; PC: " + menurezpc2 + ".\n" + "Laimėtojas: " + laimetojas + ".\n\n");
            }
        }
    }
}
