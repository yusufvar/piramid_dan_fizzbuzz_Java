package belajar.sendiri.forEachBersarang;

import java.util.Scanner;

public class forEach {
    public static void main (String[] args){

        int input;
        Scanner inputUser = new Scanner(System.in);
        input = inputUser.nextInt();

        for (int i = 1; i <= input; i++){
            for (int k = 1; k <= input; k++){
                for (int l = 1; l <= input; l++){
                    System.out.println("i = "+i+", k = "+k+", l = "+l);
                }
            }
        }
    }
}
