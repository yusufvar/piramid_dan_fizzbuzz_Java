package belajar.sendiri.piramid;

import java.util.Scanner;

public class piramid {
    public static void main (String[] args){

        int input;
        Scanner inputUser = new Scanner(System.in);
        System.out.print("Masukkan nilai : ");
        input = inputUser.nextInt();

        //perulangan segitiga siku bintang kiri
        for (int perulanganAtas = 1; perulanganAtas <= input; perulanganAtas++){
            for (int bintangAtas = perulanganAtas; bintangAtas <= input; bintangAtas++){
                System.out.print("*");
            }
            System.out.println("");

        }
        for (int perulanganBawah = 2; perulanganBawah <= input; perulanganBawah++){
            for (int bintangBawah = 1; bintangBawah <= perulanganBawah; bintangBawah++){
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println("");
        //perulangan sigitiga siku kanan
        for (int perulanganAtas = 2; perulanganAtas <= input; perulanganAtas++){
            for (int bintangAtas = perulanganAtas; bintangAtas <= input; bintangAtas++){
                System.out.print(" ");
            }
            for (int bintangBawah = perulanganAtas; bintangBawah >= 2; bintangBawah--){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int perulanganBawah = 1; perulanganBawah <= input; perulanganBawah++){
            for (int bintangAtas = 1; bintangAtas <= perulanganBawah-1; bintangAtas++){
                System.out.print(" ");
            }
            for (int bintangBawah = 1; bintangBawah <= input - perulanganBawah + 1; bintangBawah++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
