package questions;

import java.util.Scanner;

public class Question2 {


    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.println("Base: ");
        int n = sr.nextInt();
        System.out.println("Exp: ");
        int e = sr.nextInt();
        int result = 1, r = 1;
        do {
            result = result * n;
            r++;
        } while (r <= e);
        System.out.println(result);
    }
}
