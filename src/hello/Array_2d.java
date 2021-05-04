package hello;

/**
 *
 * @author tomas
 */
public class Array_2d {

    public static void main(String[] args) {

        int[] m = {1, 2, 3, 4, 5};
        int[][] duD = new int[m.length][m.length];

        for (int ii = 0; ii < m.length; ii++) {
            for (int i = 0; i < m.length; i++) {
                duD[ii][i] = ii + i < m.length ? m[ii+i] : m[ii+i-m.length];
            }
        }
        
        for (int ii = 0; ii < duD.length; ii++) {
            for (int i = 0; i < duD[ii].length; i++) {
                System.out.print(duD[ii][i] + "\t");
            }
            System.out.println("\n");
        }
        
        System.out.println("\n******** ******** ******** ******** ******** ******** ******** ********\n\n");
        
        for (int ii = 0; ii < m.length; ii++) {
            for (int i = 0; i < m.length; i++) {
                duD[ii][i] = i - ii >= 0 ? m[i-ii] : m[i-ii+m.length];
            }
        }
        
        for (int ii = 0; ii < duD.length; ii++) {
            for (int i = 0; i < duD[ii].length; i++) {
                System.out.print(duD[ii][i] + "\t");
            }
            System.out.println("\n");
        }

        /*
        sukurti kvadratini masyva,
        kurio eiluciu kiekis lygus duoto masyvo elementu kiekiui
       
        uzpildyti kvadratini masyva tokiu budu:
        1, 2, 3, 4, 5
        2, 3, 4, 5, 1
        3, 4, 5, 1, 2
        4, 5, 1, 2, 3
        5, 1, 2, 3, 4
        atspausdinti
       
        uzpildyti kvadratini masyva tokiu budu:
        1, 2, 3, 4, 5
        5, 1, 2, 3, 4
        4, 5, 1, 2, 3
        3, 4, 5, 1, 2
        2, 3, 4, 5, 1
        atspausdinti


        
        int[] m = {1, 2, 3};

        int[][] kv = new int[m.length][m.length];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                kv[i][(j + i) % m.length] = m[j];
            }
        }
        for (int i = 0; i < kv.length; i++) {
            for (int j = 0; j < kv[i].length; j++) {
                System.out.print(kv[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }
        
        System.out.println("------");
        
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                kv[i][j] = m[(j + i) % m.length];
            }
        }
        for (int i = 0; i < kv.length; i++) {
            for (int j = 0; j < kv[i].length; j++) {
                System.out.print(kv[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }
         */
    }
}
