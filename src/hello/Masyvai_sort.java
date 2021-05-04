package hello;

import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author tomas
 */
public class Masyvai_sort {

    public static void main(String[] args) {

        Integer[] masyvas = {123, -1, 5, -7};

        System.out.println("Originalus masyvas:");
        for (int i = 0; i < masyvas.length; i++) {
            System.out.print(masyvas[i] + "\t");
        }
        System.out.println("\n");

        Arrays.sort(masyvas);

        System.out.println("Masyvas didėjimo tvarka:");
        for (int i = 0; i < masyvas.length; i++) {
            System.out.print(masyvas[i] + "\t");
        }
        System.out.println("\n");

        Arrays.sort(masyvas, Collections.reverseOrder());

        System.out.println("Masyvas mažėjimo tvarka:");
        for (int i = 0; i < masyvas.length; i++) {
            System.out.print(masyvas[i] + "\t");
        }
        System.out.println("\n");

//      ******** ******** ******** ******** ******** ******** ******** ********
        int tmp;
        for (int i = 0; i < masyvas.length - 1; i++) {
            for (int j = i + 1; j < masyvas.length; j++) {
                if (masyvas[i] > masyvas[j]) {
                    tmp = masyvas[j];
                    masyvas[j] = masyvas[i];
                    masyvas[i] = tmp;
                }
            }
        }

        System.out.println("Masyvas didėjimo tvarka:");
        for (int i = 0; i < masyvas.length; i++) {
            System.out.print(masyvas[i] + "\t");
        }
        System.out.println("\n");

        for (int i = 0; i < masyvas.length - 1; i++) {
            for (int j = i + 1; j < masyvas.length; j++) {
                if (masyvas[i] < masyvas[j]) {
                    tmp = masyvas[j];
                    masyvas[j] = masyvas[i];
                    masyvas[i] = tmp;
                }
            }
        }

        System.out.println("Masyvas mažėjimo tvarka:");
        for (int i = 0; i < masyvas.length; i++) {
            System.out.print(masyvas[i] + "\t");
        }
        System.out.println("\n");

    }
}
