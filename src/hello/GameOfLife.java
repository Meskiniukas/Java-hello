package hello;

/**
 *
 * @author tomas
 */
public class GameOfLife {

    public static void main(String[] args) {

        int aukstis = 50;
        int eilutes = 4;            //4    //15
        int stulpeliai = 5;         //5    //30

        char[][][] field = new char[aukstis][eilutes][stulpeliai];
        char[][] blynas = new char[eilutes + 2][stulpeliai + 2];
        int[][] kaimynai = new int[eilutes][stulpeliai];

        int zzz = 0;
        for (int ii = 0; ii < field[zzz].length; ii++) {
            for (int i = 0; i < field[zzz][ii].length; i++) {
                if (Math.random() < 0.5) {      //0.5  //0.22
                    field[zzz][ii][i] = 'X';
                } else {
                    field[zzz][ii][i] = '.';
                }
            }
        }

        int iter = 0;
        for (zzz = 1; zzz < field.length; zzz++) {
            for (int ii = 0; ii < blynas.length; ii++) {
                for (int i = 0; i < blynas[ii].length; i++) {
                    blynas[ii][i] = '.';
                }
            }

            for (int ii = 1; ii < blynas.length - 1; ii++) {
                for (int i = 1; i < blynas[ii].length - 1; i++) {
                    blynas[ii][i] = field[zzz - 1][ii - 1][i - 1];
                }
            }

            for (int ii = 0; ii < kaimynai.length; ii++) {
                for (int i = 0; i < kaimynai[ii].length; i++) {
                    kaimynai[ii][i] = 0;
                }
            }

            for (int ii = 1; ii < blynas.length - 1; ii++) {
                for (int i = 1; i < blynas[ii].length - 1; i++) {
                    if (blynas[ii - 1][i - 1] == 'X') {
                        kaimynai[ii - 1][i - 1]++;
                    }
                    if (blynas[ii - 1][i] == 'X') {
                        kaimynai[ii - 1][i - 1]++;
                    }
                    if (blynas[ii - 1][i + 1] == 'X') {
                        kaimynai[ii - 1][i - 1]++;
                    }
                    if (blynas[ii][i - 1] == 'X') {
                        kaimynai[ii - 1][i - 1]++;
                    }
                    if (blynas[ii][i + 1] == 'X') {
                        kaimynai[ii - 1][i - 1]++;
                    }
                    if (blynas[ii + 1][i - 1] == 'X') {
                        kaimynai[ii - 1][i - 1]++;
                    }
                    if (blynas[ii + 1][i] == 'X') {
                        kaimynai[ii - 1][i - 1]++;
                    }
                    if (blynas[ii + 1][i + 1] == 'X') {
                        kaimynai[ii - 1][i - 1]++;
                    }
                }
            }

            int alive;
            for (int ii = 0; ii < field[zzz].length; ii++) {
                for (int i = 0; i < field[zzz][ii].length; i++) {
                    alive = field[zzz - 1][ii][i] == 'X' ? 1 : 0;
                    switch (alive) {
                        case 1 -> {
                            if (kaimynai[ii][i] == 2 || kaimynai[ii][i] == 3) {
                                field[zzz][ii][i] = 'X';
                            } else {
                                field[zzz][ii][i] = '.';
                            }
                        }
                        case 0 -> {
                            if (kaimynai[ii][i] == 3) {
                                field[zzz][ii][i] = 'X';
                            } else {
                                field[zzz][ii][i] = '.';
                            }
                        }
                    }
                }
            }

            int replica;
            int duplicate = 0;
            for (int rec = zzz - 1; rec >= 0; rec--) {
                replica = 0;
                for (int ii = 0; ii < field[zzz].length; ii++) {
                    for (int i = 0; i < field[zzz][ii].length; i++) {
                        if (field[zzz][ii][i] == field[rec][ii][i]) {
                            replica++;
                        } else {
                            replica = 0;
                            break;
                        }
                    }
                    if (replica == 0) {
                        break;
                    }
                }
                duplicate = replica == eilutes * stulpeliai ? 1 : 0;
                iter = zzz + 1;
                if (duplicate == 1) {
                    break;
                }
            }
            if (duplicate == 1) {
                break;
            }
        }

        for (zzz = 0; zzz < iter; zzz++) {
            for (int ii = 0; ii < field[zzz].length; ii++) {
                for (int i = 0; i < field[zzz][ii].length; i++) {
                    System.out.print(field[zzz][ii][i] + "  ");
                }
                System.out.println("\n");
            }
            System.out.println("\n");
        }
        System.out.println("Iteracijų skaičius: " + iter + "\n");
    }
}

//        for (int ii = 0; ii < field[zzz].length; ii++) {
//            for (int i = 0; i < field[zzz][ii].length; i++) {
//                System.out.print(field[zzz][ii][i] + "  ");
//            }
//            System.out.println("\n");
//        }
//        System.out.println("\n");
//        for (int ii = 0; ii < blynas.length; ii++) {
//            for (int i = 0; i < blynas[ii].length; i++) {
//                System.out.print(blynas[ii][i] + "  ");
//            }
//            System.out.println("\n");
//        }
//        System.out.println("\n");
//        for (int ii = 0; ii < kaimynai.length; ii++) {
//            for (int i = 0; i < kaimynai[ii].length; i++) {
//                System.out.print(kaimynai[ii][i] + "  ");
//            }
//            System.out.println("\n");
//        }
//        System.out.println("\n");
