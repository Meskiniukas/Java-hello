package hello;

import java.util.Scanner;

public class Hello {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        System.out.println("Ivesk pirma skaiciu:");
        int sk1 = sc.nextInt();

        System.out.println("Ivesk antra skaiciu:");
        int sk2 = sc.nextInt();

        System.out.println("Ivesk trecia skaiciu:");
        int sk3 = sc.nextInt();

        System.out.println("Ivesk ketvirta skaiciu:");
        int sk4 = sc.nextInt();

        int sum = sk1 + sk2 + sk3 + sk4;

        System.out.println("Skaiciu suma: " + sum);

        double vidurkis = (double) sum / 4;
        // double vidurkis = sum / 4.0;

        System.out.println("Vidurkis: " + vidurkis);

        
        double modulis = Math.abs(-88);
        System.out.println(modulis);
        
        System.out.println("Ivesk AX:");
        int AX = sc.nextInt();

        System.out.println("Ivesk AY:");
        int AY = sc.nextInt();

        System.out.println("Ivesk BX:");
        int BX = sc.nextInt();

        System.out.println("Ivesk BY:");
        int BY = sc.nextInt();

        System.out.println("Ivesk CX:");
        int CX = sc.nextInt();

        System.out.println("Ivesk CY:");
        int CY = sc.nextInt();

        double a = Math.sqrt(Math.pow((double) (AX - BX), 2) + Math.pow((double) (AY - BY), 2));
        System.out.println("Krastine a: " + a);

        double b = Math.sqrt(Math.pow((double) (CX - BX), 2) + Math.pow((double) (CY - BY), 2));
        System.out.println("Krastine b: " + b);

        double c = Math.sqrt(Math.pow((double) (AX - CX), 2) + Math.pow((double) (AY - CY), 2));
        System.out.println("Krastine c: " + c);

        System.out.println("Perimetras: " + (a + b + c));
        
        
        int iii = 1;
        double xcoords[] = new double[3];
        double ycoords[] = new double[3];
        System.out.println("Enter x and y coordinates for each point of the triangle:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter x" + iii + " : ");
            xcoords[i] = sc.nextDouble();
            System.out.print("Enter y" + iii + " : ");
            ycoords[i] = sc.nextDouble();
            iii++;
        }
                      
        int p = 2;
        
        double a = ycoords[1]-ycoords[0];
        double aa = xcoords[1]-xcoords[0];
        double aas = Math.pow(a, p) + Math.pow(aa, p);
        double aside = Math.sqrt(aas);
        
        double b = ycoords[2]-ycoords[0];
        double bb = xcoords[2]-xcoords[0];
        double bbs = Math.pow(b, p) + Math.pow(bb, p);
        double bside = Math.sqrt(bbs);
        
        double c = ycoords[2]-ycoords[1];
        double cc = xcoords[2]-xcoords[1];
        double ccs = Math.pow(c, p) + Math.pow(cc, p);
        double cside = Math.sqrt(ccs);
        
        double per = aside + bside + cside;
        
        System.out.println("Perimeter of the triangle is: " + per);
         */
        System.out.println("Ivesk pirma skaiciu:");
        int sk01 = sc.nextInt();

        System.out.println("Ivesk antra skaiciu:");
        int sk02 = sc.nextInt();

        int sumaIntervale = 0;

        if (sk02 < sk01) {
            int tmpNumber = sk01;
            sk01 = sk02;
            sk02 = tmpNumber;
        }

        int skconst01 = sk01;
        int skconst02 = sk02;

        while (sk01 <= sk02) {
            sumaIntervale = sumaIntervale + sk01;
            sk01++;
        }

        System.out.println("");
        System.out.println("Suma intervale nuo " + skconst01 + " iki " + skconst02 + " lygi: " + sumaIntervale);

        sk01 = skconst01;
        sk02 = skconst02;
        System.out.println("");
        System.out.print("Nelyginiai skaičiai nuo " + skconst01 + " iki " + skconst02 + " yra: ");
        while (sk01 <= sk02) {
            if (sk01 % 2 != 0) {
                System.out.print(sk01 + " ");
            }
            sk01++;
        }
        System.out.println("");

        sk01 = skconst01;
        sk02 = skconst02;
        System.out.println("");
        System.out.println("Skaičių intervalo nuo " + skconst01 + " iki " + skconst02 + " daugybos lentelė -->");
        for (int ii = sk01; ii <= sk02; ii++) {
            for (int i = skconst01; i <= sk02; i++) {
                System.out.print(sk01 * i + "\t");
            }
            System.out.println("");
            sk01++;
        }

//        short i = 1;
//        for (; i < 100; ) {
//            System.out.println(i++);
//        }
//        System.out.println("Po visko i= " + i);
    }
}
