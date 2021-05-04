/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

/**
 *
 * @author tomas
 */
public class AliausMedziaga {
    
}
// public static void printArray(int[][] m) {
//        for (int i = 0; i < m.length; i++) {
//            for (int j = 0; j < m[i].length; j++) {
//                System.out.print(m[i][j]);
//                System.out.print("\t");
//            }
//            System.out.println();
//        }
//    }
//
// 
//
//    public static void main(String[] args) {
//
// 
//
//        int[][] masyvas = {
//            {5, 6, 7, 8, 9, 0},
//            {},
//            {1, 2, 3},
//            {1, 2, 3, 5, 6, 7, 8, 9}
//        };
//
// 
//
//        printArray(masyvas);
//    }


//public static long fakt(long sk) {
//        if (sk < 0) {
//            return -1;
//        }
//        if (sk == 0) {
//            return 1;
//        }
//        return sk * fakt(sk - 1);
//    }

 /*
        primityviu tipu sarasas:
        boolean
        char
        byte
        short
        int
        long
        float
        double
        */

 

        /*
        kaip vadinami kintamieji (ir metodai)
        camel-case
        raides, skaiciai, _, $
        (skaicius negali buti priekyje)
        */

 

        /*
        matematiniai operatoriai:
        +
        -
        /
        *
        %

 

        >> - bitwise shift to right
        byte a = 5;         00000101
        byte b = a >> 2;    00000001(01)

 

        byte a = -126;      10000010
        byte b = a >> 1;    11000001(0)

 

        << - bitwise shift to left
        byte a = 5;         00000101
        byte b = a >> 2;    00010100

 

        >>> - bitwise shift to right (zero fill)
        byte a = -126;      10000010
        byte b = a >>> 1;   01000001(0)

 

        ~ bitwise invert
        byte a = -126;      10000010
        byte b = ~a;        01111101

 

        & bitwise and
        byte a = -126;      10000010

 

                            10000010
                            00000110
        byte b = a & 6;     00000010

 

        | bitwise or
        byte a = -126;      10000010

 

                            10000010
                            00000110
        byte b = a | 6;     10000110

 

        */

 

        /*
        plyginimo operatoriai:
        >
        <
        >=
        <=
        ==
        !=
        */

 

        /*
        loginiai operatoriai:
        & - tikrina abi puses
        && - jei pirma false, antros puses netikrina
        | - tikrina abi puses
        || - jei pirma true, antros puses netikrina
        ^ - true jei operandai skirtingi
        !
        */

 

        /*
        if

 

        if (salyga) {   // salyga butinai turi buti tipo boolean
        }               // jei yra tik viena komanda gali buti be bloko
                        // blokas (ar komanda) vykdomi, kai salyga true

 

        else            // blokas (ar komanda) vykdomi, kai salyga false
          if (kitaSalyga) { // jei yra tik viena komanda gali buti be bloko
          }               // blokas (ar komanda) vykdomi, kai kitaSalyga true

 

          else {          // jei yra tik viena komanda gali buti be bloko
          }               // blokas (ar komanda) vykdomi, kai kitaSalyga false
        */

 

        /*
        switch
        
        switch (kintamasis) {
            case reiksme1:
                // komandos
                // break;
            case reiksme2:
                // komandos
                // break;
            default:
                // komandos
                // break;
        }
        */
        
        /*
        ciklai:
        for
        while
        do while
        */
        
        /*
        for
        !!! turi savo scope !!!
        
        for ( pirmaDalis; antraDalis; ketvirtaDalis ) {
            treciaDalis
        }
        pirmaDalis - komanda(os) butinai bus ivykdytos
                     int i = 5, j = 7;
        antraDalis - boolean jei true - vykdom 3, jei false nutraukiam
        treciaDalis - ciklo kunas: blokas arba komanda
        ketvirtaDalis - komanda(os) bus ivykdytos po 3 dalies po to tikrinam 2 dali
        
        3 daly galim panaudoti:
        continue;   - nutraukia ciklo kuna ir eina i 4 dali
        break;      - nutraukia visa cikla
        
        */
//        int i = 5;
//        for (test(); i < 10; i++) {
//            
//        }
//        for (int j = 5 + 3 * 10 / 11; i < 10; i++) {
//        }
        
        /*
        while
        
        while (salyga) {
        // ciklo kunas blokas arba 1 komanda
        }
        
        tikrinam salyga - jei true - darom ciklo kuna; jei false - baigiam cikla
        ciklo kunas - atliekam ir vel einam tikrinti salygos
        
        ciklo kune galim panaudoti:
        continue;   - nutraukia ciklo kuna ir eina tikrinti salygos
        break;      - nutraukia visa cikla
        */
        
        /*
        do while
        
        do {
        // ciklo kunas blokas arba 1 komanda
        } while (salyga)
        
        ciklo kunas - atliekam ir einam tikrinti salygos
        tikrinam salyga - jei true - vel darom ciklo kuna; jei false - baigiam cikla
        
        ciklo kune galim panaudoti:
        continue;   - nutraukia ciklo kuna ir eina tikrinti salygos
        break;      - nutraukia visa cikla
        */
        
        /*
        metodai
        
        tipas pavadinimas (tipas kPav1, tipas kPav2, tipas kPav3) {
            // metodo kunas
            return metodoPaskaiciavimuReiksme; // turi atitikti metodo tipa
        }
        
        metodo tipas gali buti specialus: void - metodas negrazina jokios reiksmes
                                          return gali nebuti
        
        pavadinimas(reiksme1, reiksme2, reiskme3);
        
        kai kvieciamas metodas: esamas scope sustabdomas, !!!sukuriamas naujas!!! scope,
            vykdomas iki return arba pabaigos
        */
//    }

 

//    public static void test() {
//        System.out.println("Testas");
//    }
//}