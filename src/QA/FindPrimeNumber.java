package QA;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindPrimeNumber {
    public static void main(String[] args) {
        int n;
        System.out.println("Nhap so nguyen duong n: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int count = 0;
        List<Integer> list = new ArrayList<Integer>();

        if (n <= 0) {
            System.out.println(" Nhap khong chinh xac ");
        } else if (n > 0 && n < 2) {
            System.out.println("Khong tim thay so nguyen to nao nho hon so vua nhap.");
        } else {
            while (n > 0) {
                for (int i = 1; i <= n; i++) {
                    if (n % i == 0) {
                        count++;
                    }
                }
                if (count == 2) {
                    list.add(n);
                    count = 0;
                } else {
                    count = 0;
                }
                n--;
            }
            System.out.println("Cac so nguyen to thoa man dieu kien < n la: ");
            for (int i = 0; i < list.size() - 1; i++) {
                System.out.print(list.get(i) + " ,");
            }
            System.out.print(list.get(list.size() - 1));
        }
    }
}
