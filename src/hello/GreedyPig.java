package hello;

import java.util.Scanner;

/**
 *
 * @author tomas
 */
public class GreedyPig {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int countlimit = 50;
        int pc1pc2countlimit = 50000;
        int menu = -1;
        int submenu;
        int pig;
        int ridensi;
        int count1stable;
        int count1;
        int count2stable;
        int count2;

        while (menu != 0) {
            System.out.println("******** ******** ******** ********\nŽaidimo meniu:\n\n1. Žaidžia Žaidėjas1 <--> Žaidėjas2\n2. Žaidžia Žaidėjas1 <--> PC\n3. Žaidžia PC1 [Algoritmas 5x] <--> PC2 [Algoritmas 18t]\n\n0: PABAIGA\n");
            menu = sc.nextInt();
            if (menu < 0 || menu > 3) {
                System.out.println("\nTamsta esate mulkis!\n\n\n");
            }
            switch (menu) {
                case 1 -> {
                    count1stable = 0;
                    count1 = 0;
                    count2stable = 0;
                    count2 = 0;
                    while (count1stable < countlimit && count2stable < countlimit) {
                        while (true) {
                            pig = (int) (Math.random() * 6 + 1);
                            if (pig > 1) {
                                count1 += pig;
                                if (count1stable + count1 >= countlimit) {
                                    System.out.println("Žaidėjas-1  Išriedėjo: " + pig + "; Taškų šiame ridenime: " + count1 + "; VISO Taškų: " + (count1stable + count1) + ". Laimėjo Žaidėjas-1. Žaidėjas-2 surinko: " + count2stable + " taškų.\n\n");
                                    count1stable += count1;
                                    break;
                                }
                                System.out.println("Žaidėjas-1  Išriedėjo: " + pig + "; Taškų šiame ridenime: " + count1 + "; Stabilių taškų: " + count1stable + ". Ar ridensi darsyk (0 - NE; 1 ar bet koks kitas sveikas skaičius - TAIP.) ?\n");
                                ridensi = sc.nextInt();;
                                if (ridensi == 0) {
                                    count1stable += count1;
                                    count1 = 0;
                                    break;
                                }
                            } else {
                                count1 = 0;
                                System.out.println("Žaidėjas-1  Išriedėjo: " + pig + "; Taškų šiame ridenime: " + count1 + "; Stabilių taškų: " + count1stable + ". Ridena Žaidėjas-2.\n\n");
                                break;
                            }
                        }
                        while (true) {
                            if (count1stable >= countlimit) {
                                break;
                            }
                            pig = (int) (Math.random() * 6 + 1);
                            if (pig > 1) {
                                count2 += pig;
                                if (count2stable + count2 >= countlimit) {
                                    System.out.println("Žaidėjas-2  Išriedėjo: " + pig + "; Taškų šiame ridenime: " + count2 + "; VISO Taškų: " + (count2stable + count2) + ". Laimėjo Žaidėjas-2. Žaidėjas-1 surinko: " + count1stable + " taškų.\n\n");
                                    count2stable += count2;
                                    break;
                                }
                                System.out.println("Žaidėjas-2  Išriedėjo: " + pig + "; Taškų šiame ridenime: " + count2 + "; Stabilių taškų: " + count2stable + ". Ar ridensi darsyk (0 - NE; 1 ar bet koks kitas sveikas skaičius - TAIP.) ?\n");
                                ridensi = sc.nextInt();
                                if (ridensi == 0) {
                                    count2stable += count2;
                                    count2 = 0;
                                    break;
                                }
                            } else {
                                count2 = 0;
                                System.out.println("Žaidėjas-2  Išriedėjo: " + pig + "; Taškų šiame ridenime: " + count2 + "; Stabilių taškų: " + count2stable + ". Ridena Žaidėjas-1.\n\n");
                                break;
                            }
                        }
                    }
                }
                case 2 -> {
                    System.out.println("\nPasirinkite PC algoritmą:\n\n0 - [Algoritmas 5x]\n1 ar bet koks kitas sveikas skaičius - [Algoritmas 18t]\n");
                    submenu = sc.nextInt();
                    switch (submenu) {
                        case 0 -> {
                            count1stable = 0;
                            count1 = 0;
                            count2stable = 0;
                            count2 = 0;
                            while (count1stable < countlimit && count2stable < countlimit) {
                                while (true) {
                                    pig = (int) (Math.random() * 6 + 1);
                                    if (pig > 1) {
                                        count1 += pig;
                                        if (count1stable + count1 >= countlimit) {
                                            System.out.println("Žaidėjas-1  Išriedėjo: " + pig + "; Taškų šiame ridenime: " + count1 + "; VISO Taškų: " + (count1stable + count1) + ". Laimėjo Žaidėjas-1. PC1 surinko: " + count2stable + " taškų.\n\n");
                                            count1stable += count1;
                                            break;
                                        }
                                        System.out.println("Žaidėjas-1  Išriedėjo: " + pig + "; Taškų šiame ridenime: " + count1 + "; Stabilių taškų: " + count1stable + ". Ar ridensi darsyk (0 - NE; 1 ar bet koks kitas sveikas skaičius - TAIP.) ?\n");
                                        ridensi = sc.nextInt();
                                        if (ridensi == 0) {
                                            count1stable += count1;
                                            count1 = 0;
                                            break;
                                        }
                                    } else {
                                        count1 = 0;
                                        System.out.println("Žaidėjas-1  Išriedėjo: " + pig + "; Taškų šiame ridenime: " + count1 + "; Stabilių taškų: " + count1stable + ". Ridena PC1.\n\n");
                                        break;
                                    }
                                }
                                ridensi = 0;
                                while (ridensi < 5) {
                                    if (count1stable >= countlimit) {
                                        break;
                                    }
                                    pig = (int) (Math.random() * 6 + 1);
                                    ridensi++;
                                    if (pig > 1) {
                                        count2 += pig;
                                        if (count2stable + count2 >= countlimit) {
                                            System.out.println("PC1  Išriedėjo: " + pig + "; Taškų šiame ridenime: " + count2 + "; VISO Taškų: " + (count2stable + count2) + ". Laimėjo PC1. Žaidėjas-1 surinko: " + count1stable + " taškų.\n\n");
                                            count2stable += count2;
                                            break;
                                        }
                                        if (ridensi == 5) {
                                            count2stable += count2;
                                            System.out.println("PC1  Išriedėjo: " + pig + "; Taškų šiame ridenime: " + count2 + "; Stabilių taškų: " + count2stable + ".\n\n");
                                            count2 = 0;
                                        }
                                        if (ridensi < 5) {
                                            System.out.println("PC1  Išriedėjo: " + pig + "; Taškų šiame ridenime: " + count2 + "; Stabilių taškų: " + count2stable + ".\n");
                                        }
                                    } else {
                                        count2 = 0;
                                        System.out.println("PC1  Išriedėjo: " + pig + "; Taškų šiame ridenime: " + count2 + "; Stabilių taškų: " + count2stable + ". Ridena Žaidėjas-1.\n\n");
                                        break;
                                    }
                                }
                            }
                        }
                        default -> {
                            count1stable = 0;
                            count1 = 0;
                            count2stable = 0;
                            count2 = 0;
                            while (count1stable < countlimit && count2stable < countlimit) {
                                while (true) {
                                    pig = (int) (Math.random() * 6 + 1);
                                    if (pig > 1) {
                                        count1 += pig;
                                        if (count1stable + count1 >= countlimit) {
                                            System.out.println("Žaidėjas-1  Išriedėjo: " + pig + "; Taškų šiame ridenime: " + count1 + "; VISO Taškų: " + (count1stable + count1) + ". Laimėjo Žaidėjas-1. PC2 surinko: " + count2stable + " taškų.\n\n");
                                            count1stable += count1;
                                            break;
                                        }
                                        System.out.println("Žaidėjas-1  Išriedėjo: " + pig + "; Taškų šiame ridenime: " + count1 + "; Stabilių taškų: " + count1stable + ". Ar ridensi darsyk (0 - NE; 1 ar bet koks kitas sveikas skaičius - TAIP.) ?\n");
                                        ridensi = sc.nextInt();
                                        if (ridensi == 0) {
                                            count1stable += count1;
                                            count1 = 0;
                                            break;
                                        }
                                    } else {
                                        count1 = 0;
                                        System.out.println("Žaidėjas-1  Išriedėjo: " + pig + "; Taškų šiame ridenime: " + count1 + "; Stabilių taškų: " + count1stable + ". Ridena PC2" + ".\n\n");
                                        break;
                                    }
                                }
                                while (count2 < 18) {
                                    if (count1stable >= countlimit) {
                                        break;
                                    }
                                    pig = (int) (Math.random() * 6 + 1);
                                    if (pig > 1) {
                                        count2 += pig;
                                        if (count2stable + count2 >= countlimit) {
                                            System.out.println("PC2  Išriedėjo: " + pig + "; Taškų šiame ridenime: " + count2 + "; VISO Taškų: " + (count2stable + count2) + ". Laimėjo PC2. Žaidėjas-1 surinko: " + count1stable + " taškų.\n\n");
                                            count2stable += count2;
                                            break;
                                        }
                                        if (count2 >= 18) {
                                            count2stable += count2;
                                            System.out.println("PC2  Išriedėjo: " + pig + "; Taškų šiame ridenime: " + count2 + "; Stabilių taškų: " + count2stable + ".\n\n");
                                            count2 = 0;
                                            break;
                                        }
                                        if (count2 < 18) {
                                            System.out.println("PC2  Išriedėjo: " + pig + "; Taškų šiame ridenime: " + count2 + "; Stabilių taškų: " + count2stable + ".\n");
                                        }
                                    } else {
                                        count2 = 0;
                                        System.out.println("PC2  Išriedėjo: " + pig + "; Taškų šiame ridenime: " + count2 + "; Stabilių taškų: " + count2stable + ". Ridena Žaidėjas-1.\n\n");
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                case 3 -> {
                    count1stable = 0;
                    count1 = 0;
                    count2stable = 0;
                    count2 = 0;
                    while (count1stable < pc1pc2countlimit && count2stable < pc1pc2countlimit) {
                        ridensi = 0;
                        while (ridensi < 5) {
                            pig = (int) (Math.random() * 6 + 1);
                            ridensi++;
                            if (pig > 1) {
                                count1 += pig;
                                if (count1stable + count1 >= pc1pc2countlimit) {
                                    System.out.println("PC1  Išriedėjo: " + pig + "; Taškų šiame ridenime: " + count1 + "; VISO Taškų: " + (count1stable + count1) + ". Laimėjo PC1. PC2 surinko: " + count2stable + " taškų.\n\n");
                                    count1stable += count1;
                                    break;
                                }
                                if (ridensi == 5) {
                                    count1stable += count1;
                                    System.out.println("PC1  Išriedėjo: " + pig + "; Taškų šiame ridenime: " + count1 + "; Stabilių taškų: " + count1stable + ".\n\n");
                                    count1 = 0;
                                }
                                if (ridensi < 5) {
                                    System.out.println("PC1  Išriedėjo: " + pig + "; Taškų šiame ridenime: " + count1 + "; Stabilių taškų: " + count1stable + ".\n");
                                }
                            } else {
                                count1 = 0;
                                System.out.println("PC1  Išriedėjo: " + pig + "; Taškų šiame ridenime: " + count1 + "; Stabilių taškų: " + count1stable + ". Ridena PC2.\n\n");
                                break;
                            }
                        }
                        while (count2 < 18) {
                            if (count1stable >= pc1pc2countlimit) {
                                break;
                            }
                            pig = (int) (Math.random() * 6 + 1);
                            if (pig > 1) {
                                count2 += pig;
                                if (count2stable + count2 >= pc1pc2countlimit) {
                                    System.out.println("PC2  Išriedėjo: " + pig + "; Taškų šiame ridenime: " + count2 + "; VISO Taškų: " + (count2stable + count2) + ". Laimėjo PC2. PC1 surinko: " + count1stable + " taškų.\n\n");
                                    count2stable += count2;
                                    break;
                                }
                                if (count2 >= 18) {
                                    count2stable += count2;
                                    System.out.println("PC2  Išriedėjo: " + pig + "; Taškų šiame ridenime: " + count2 + "; Stabilių taškų: " + count2stable + ".\n\n");
                                    count2 = 0;
                                    break;
                                }
                                if (count2 < 18) {
                                    System.out.println("PC2  Išriedėjo: " + pig + "; Taškų šiame ridenime: " + count2 + "; Stabilių taškų: " + count2stable + ".\n");
                                }
                            } else {
                                count2 = 0;
                                System.out.println("PC2  Išriedėjo: " + pig + "; Taškų šiame ridenime: " + count2 + "; Stabilių taškų: " + count2stable + ". Ridena PC1.\n\n");
                                break;
                            }
                        }
                    }
                }
            }
        }
    }
}
