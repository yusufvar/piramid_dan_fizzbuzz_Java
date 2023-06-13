package belajar.sendiri.diamonKotak;

import java.util.Scanner;

public class diamonKotak {
    public static void main(String[] args) {
        int input;
        Scanner inputUser = new Scanner(System.in);
        input = inputUser.nextInt();

        for (int i = 1; i <= input; i++){
            for (int j = i; j <= input; j++){
                System.out.print(j);
            }
            System.out.println();
    }
    }
}
