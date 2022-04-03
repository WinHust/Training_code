package QA;

import java.io.File;
import java.util.Scanner;

public class MinPriceStruc {

    public static void main(String[] args) throws java.io.IOException {
        File data = new File("src/data.txt");
        Scanner scanner = new Scanner(data);
        String line = scanner.nextLine();
        String[] array = line.split(" ");
        for (int number_test_case = 0; number_test_case < Integer.parseInt(array[0]); number_test_case++) {
            line = scanner.nextLine();
            int hang = Integer.parseInt(line.split(" ")[0]);
            int cot = Integer.parseInt(line.split(" ")[1]);
            int[][] data1 = new int[hang][cot];
            int max = data1[0][0];
            for (int i = 0; i < hang; i++) {
                line = scanner.nextLine();
                for (int j = 0; j < cot; j++) {
                    data1[i][j] = Integer.parseInt(line.split(" ")[j]);
                    if (max <= data1[i][j]) {
                        max = data1[i][j];
                    }
                }
            }
            int chiphi;
            int min_price = Integer.MAX_VALUE;
            int kqtang = 0;
            for (int tang = 0; tang <= max; tang++) {
                chiphi = 0;
                for (int i = 0; i < hang; i++) {
                    for (int j = 0; j < cot; j++) {
                        if (tang >= data1[i][j]) {
                            int chiphixaythem = (tang - data1[i][j]) * 2;
                            chiphi = chiphi + chiphixaythem;
                        } else {
                            int chiphidapdi = (data1[i][j] - tang) * 2;
                            chiphi = chiphi + chiphidapdi;
                        }
                    }
                }

                if (min_price > chiphi) {
                    min_price = chiphi;
                    kqtang = tang;
                }

            }

            System.out.println("chi phi thap nhat la xay tat ca: " + kqtang + " tang voi gia: " + min_price + "$");
        }
    }
}