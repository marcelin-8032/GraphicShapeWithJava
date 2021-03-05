package patterns;

import java.util.Scanner;

public class Pattern5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Rows: ");
        int rows = sc.nextInt();
        System.out.println("Col: ");
        int col = sc.nextInt();
        if (rows <= 0 || col <= 0) {
            System.out.println("The value should not be zero or negative!!!");
        } else {
            for (int i = 1; i <= rows; i++) {
                for (int j = 1; j <= col; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

    }


}
/*
 *****
 *****
 *****
 *****
 *****
 *****
 *****
 *****
 *****
 *****
 */