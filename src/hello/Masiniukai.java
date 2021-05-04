package hello;

/**
 *
 * @author tomas
 */
public class Masiniukai {

    public static void main(String[] args) {

        int[] masiniukai = new int[4];
        int championdistance = 0;
        int tmpfinish = 100;
        int champion = -1;

        while (tmpfinish <= 1000) {
            for (int i = 0; i < masiniukai.length; i++) {
                masiniukai[i] += (int) (Math.random() * 5 + 1);
//                System.out.println("Mašiniukas Nr. " + i + "; Atstumas: " + masiniukai[i]); //PASITIKRINIMUI
                if (masiniukai[i] > championdistance) {
                    championdistance = masiniukai[i];
                    champion = i + 1;
                }
            }
            if (championdistance >= tmpfinish) {
                if (championdistance >= 1000) {
                    System.out.println("Pasibaigus lenktynėms, po " + tmpfinish + " km LAIMĖJO mašiniukas Nr. " + champion + " 🥇!!! Nuvažiuotas atstumas: " + championdistance + "\n");
                    break;
                } else {
                    System.out.println("Po " + tmpfinish + " km pirmauja mašiniukas Nr. " + champion + "; Nuvažiuotas atstumas: " + championdistance);
                    tmpfinish += 100;
                }
            }
        }
    }
}
