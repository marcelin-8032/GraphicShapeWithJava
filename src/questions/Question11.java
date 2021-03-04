package questions;

import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {


        Scanner sccc = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.print("Array Value: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sccc.nextInt();
        }
        System.out.print("Num1: ");
        int a =
                sccc.nextInt();
        System.out.print("Num2: ");
        int b = sccc.nextInt();
        int index_a = 0, index_b = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a) {
                index_a = i;
            }
            if (arr[i] == b) {
                index_b = i;
            }
        }
        int c = arr[index_a];
        arr[index_a] = arr[index_b];
        arr[index_b] = c;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}
