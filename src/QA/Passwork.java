package QA;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Passwork {

    public static void main(String[] args) throws FileNotFoundException {

        File data = new File("src/pass.txt");
        Scanner scanner = new Scanner(data);
        String line = scanner.nextLine();
        String[] array = line.split(" ");
        int number_testcase = Integer.parseInt(array[0]);
        for (int i = 0; i < number_testcase; number_testcase++) {
            line = scanner.nextLine();
            int long_pass = Integer.parseInt(line.split(" ")[0]);
            int[][] data_ = new int[2][long_pass];
            for (int j = 0; j < 2; j++) {
                line = scanner.nextLine();
                for (int k = 0; k < long_pass; k++) {
                    data_[j][k] = Integer.parseInt(line.split(" ")[k]);
                }
            }
            int count = 0;
            int key = 0;
            for (int k = 0; k < long_pass; k++) {
                if (data_[0][k] == data_[1][k]) {
                    count++;
                }
                if (data_[0][k] == 1 && (data_[1][k] == 2 || data_[1][k] == 4)) {
                    count++;
                    key++;
                }
                if (data_[0][k] == 2 && (data_[1][k] == 1 || data_[1][k] == 3 || data_[1][k] == 5)) {
                    count++;
                    key++;
                }
                if (data_[0][k] == 3 && (data_[1][k] == 2 || data_[1][k] == 6)) {
                    count++;
                    key++;
                }
                if (data_[0][k] == 4 && (data_[1][k] == 1 || data_[1][k] == 5 || data_[1][k] == 7)) {
                    count++;
                    key++;
                }
                if (data_[0][k] == 5 && (data_[1][k] == 2 || data_[1][k] == 4 || data_[1][k] == 6 || data_[1][k] == 8)) {
                    count++;
                    key++;
                }
                if (data_[0][k] == 6 && (data_[1][k] == 9 || data_[1][k] == 3 || data_[1][k] == 5)) {
                    count++;
                    key++;
                }
                if (data_[0][k] == 7 && (data_[1][k] == 4 || data_[1][k] == 8)) {
                    count++;
                    key++;
                }
                if (data_[0][k] == 8 && (data_[1][k] == 5 || data_[1][k] == 7 || data_[1][k] == 9)) {
                    count++;
                    key++;
                }
                if (data_[0][k] == 9 && (data_[1][k] == 6 || data_[1][k] == 8)) {
                    count++;
                    key++;

                }
                if (data_[0][k] == 0 && data_[1][k] == 2) {
                    count++;
                    key++;

                }
            }
            System.out.println(count);
            System.out.println(key);
            boolean min = false;


            if (count != long_pass || key > 1) {
                System.out.println(min);

            } else {
                min = true;
                System.out.println(min);
            }
        }
    }
}
