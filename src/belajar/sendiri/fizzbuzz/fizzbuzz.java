package belajar.sendiri.fizzbuzz;

import java.util.Scanner;

public class fizzbuzz {
    public static void main (){

        int input;
        Scanner inputUser = new Scanner(System.in);
        System.out.print("Masukkan nilai : ");
        input = inputUser.nextInt();

        for (int i = 1; i <= input; i++){
            switch (i % 15){
                case 0:
                    System.out.println(i+" fizzbuzz");
                    break;
                case 3:
                case 6:
                case 9:
                    System.out.println(i+" fizz");
                    break;
                case 5:
                case 10:
                    System.out.println(i+" buzz");
                    break;
                default:
                    System.out.println(i);
                    break;
            }
        }
    }
}
