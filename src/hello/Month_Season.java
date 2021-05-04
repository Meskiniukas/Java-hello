package hello;

import java.util.Scanner;

/**
 *
 * @author tomas
 */
public class Month_Season {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Įvesk mėnesį (skaičius):");
        int month = sc.nextInt();
        System.out.println();
        
        switch (month) {
            
            case 12, 1, 2:
                System.out.println("Žiema :(\n");
                break;
            case 3, 4, 5:
                System.out.println("Pavasaris :)\n");
                break;
            case 6, 7, 8:
                System.out.println("Vasara :)\n");
                break;
            case 9, 10, 11:
                System.out.println("Ruduo...\n");
                break;
            default:
                System.out.println("Nagi nėr tokio mėnesio!\n");

        }
    }
}
