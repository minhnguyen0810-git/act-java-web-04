
package javaapplication1;

import java.util.Scanner;

public class Bai5p1 {
    public static void main(String[] args) {
        System.out.println("Nhap n: ");
        Scanner input = new Scanner(System.in);
        double n = input.nextInt();
        double s = 0;
        for (double i = 1;i <= n;i++){
            s = s + 1/i;
        }
        System.out.println("Tong S = " +s);
    }
}
