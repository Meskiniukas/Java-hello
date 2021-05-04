package hello;

import java.util.Scanner;

/**
 *
 * @author tomas
 */
public class AliausGreedyPigJOVALAS {

    public static int kauliukoMetimas() {
        return (int) (Math.random() * 6 + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int zt = 0;
        int kt = 0;

        do {
            int zmt = 0;
            int zm;
            do {
                zm = kauliukoMetimas();
                System.out.println(zm);
                if (zm != 1) {
                    zmt += zm;
                    System.out.println(zmt);
                    if (zt + zmt < 100) {
                        System.out.println("Metam dar karta? 1/0 ");
                        int darKarta = sc.nextInt();
                        if (darKarta == 0) {
                            zt += zmt;
                            zm = 1;
                        }
                    } else {
                        zt += zmt;
                        zm = 1;
                    }
                }
            } while (zm != 1);
            System.out.println(zt);
            if (zt < 100) {
                int km;
                int kmt = 0;
                int kmk = 0;
                do {
                    km = kauliukoMetimas();
                    System.out.print(km);
                    System.out.print(" ");
                    if (km != 1) {
                        kmt += km;
                    }
                } while (km != 1 && ++kmk < 5 && kmt + kt < 100);
                if (km != 1) {
                    kt += kmt;
                }
                System.out.println(kt);
            }
        } while (zt < 100 && kt < 100);
        if (zt > kt) {
            System.out.println("Laimejo zaidejas");
        } else {
            System.out.println("Laimejo kompiuteris");
        }
    }
}


//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int zt = 0;
//        int kt = 0;
//
//        do {
//            int zmt = 0;
//            int zm;
//            do {
//                zm = kauliukoMetimas();
//                System.out.println(zm);
//                if (zm != 1) {
//                    zmt += zm;
//                    System.out.println(zmt);
//                    if (zt + zmt < 100) {
//                        System.out.println("Metam dar karta? 1/0 ");
//                        int darKarta = sc.nextInt();
//                        if (darKarta == 0) {
//                            zt += zmt;
//                            zm = 1;
//                        }
//                    } else {
//                        zt += zmt;
//                        zm = 1;
//                    }
//                }
//            } while (zm != 1);
//            System.out.println(zt);
//            if (zt < 100) {
//                int km;
//                int kmt = 0;
//                do {
//                    km = kauliukoMetimas();
//                    System.out.print(km);
//                    System.out.print(" ");
//                    if (km != 1) {
//                        kmt += km;
//                    }
//                } while (km != 1 && kmt < 18 && kmt + kt < 100);
//                if (km != 1) {
//                    kt += kmt;
//                }
//                System.out.println(kt);
////                int km;
////                int kmt = 0;
////                int kmk = 0;
////                do {
////                    km = kauliukoMetimas();
////                    System.out.print(km);
////                    System.out.print(" ");
////                    if (km != 1) {
////                        kmt += km;
////                    }
////                } while (km != 1 && ++kmk < 5 && kmt + kt < 100);
////                if (km != 1) {
////                    kt += kmt;
////                }
////                System.out.println(kt);
//            }
//        } while (zt < 100 && kt < 100);
//        if (zt > kt) {
//            System.out.println("Laimejo zaidejas");
//        } else {
//            System.out.println("Laimejo kompiuteris");
//        }
//    }
//
//    public static void main(String[] args) {
//        int k1t = 0;
//        int k2t = 0;
//
//        do {
//            int k1m;
//            int k1mt = 0;
//            int k1mk = 0;
//            System.out.print("Comp1: ");
//            do {
//                k1m = kauliukoMetimas();
//                System.out.print(k1m);
//                System.out.print(" ");
//                if (k1m != 1) {
//                    k1mt += k1m;
//                }
//            } while (k1m != 1 && ++k1mk < 5 && k1mt + k1t < 100);
//            if (k1m != 1) {
//                k1t += k1mt;
//            }
//            System.out.println(k1t);
//            if (k1t < 100) {
//                int k2m;
//                int k2mt = 0;
//                System.out.print("Comp2: ");
//                do {
//                    k2m = kauliukoMetimas();
//                    System.out.print(k2m);
//                    System.out.print(" ");
//                    if (k2m != 1) {
//                        k2mt += k2m;
//                    }
//                } while (k2m != 1 && k2mt < 18 && k2mt + k2t < 100);
//                if (k2m != 1) {
//                    k2t += k2mt;
//                }
//                System.out.println(k2t);
//            }
//        } while (k1t < 100 && k2t < 100);
//        if (k1t > k2t) {
//            System.out.println("Laimejo 1-as kompiuteris");
//        } else {
//            System.out.println("Laimejo 2-as kompiuteris");
//        }
//    }
//
//}
//}
