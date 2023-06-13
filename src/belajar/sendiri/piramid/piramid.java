package belajar.sendiri.piramid;

import java.util.Scanner;

public class piramid {
    public static void main (){

        int input;
        Scanner inputUser = new Scanner(System.in);
        System.out.print("Masukkan nilai : ");
        input = inputUser.nextInt();

        for (int perulangan = input; perulangan > 1; perulangan--){
            for (int bintang = 1; bintang < perulangan; bintang++){
                System.out.print("*");
            }
//            for (int bintang2 = 10; bintang2 < 1; bintang2--){
//                System.out.print("*");
//            }
            System.out.println("");

        }
        for (int perulangan1 = 2; perulangan1 < input; perulangan1++){
            for (int bintang1 = 0; bintang1 < perulangan1; bintang1++){
                System.out.print("*");
            }
            System.out.println("");
        }
//        for (int i = 10; i >= 1; i--){
//            System.out.println(i);
//        }
    }
}
