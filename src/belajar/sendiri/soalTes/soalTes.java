package belajar.sendiri.soalTes;

public class soalTes {
    public static void main (String[] args){
        int a = 45;
        int b = 112;
        System.out.println("tukar nilai a dan b");
        System.out.println("a awal = "+a);
        System.out.println("b awal = "+b);

        a -= b;
        b += a;
        a = b-a;

        System.out.println("a awal = "+a);
        System.out.println("b awal = "+b);
        System.out.println("---------------");
        System.out.println("");
        System.out.println("Buatlah deret bilangan prima (angka 1-100)");
        for (int i = 1; i <=100; i++){
            System.out.println(i);
        }
        System.out.println("---------------");
        System.out.println("");
        System.out.println("Ciptakan deret bilangan ganjil (angka 1-100)");
        for (int i = 1; i <= 100; i++){
            if (i % 2 == 0){
            }else {
                System.out.println(i);
            }
        }
        System.out.println("---------------");
        System.out.println("");
        System.out.println("Sebutkan deret bilangan genap (angka 1-100) !");
        for (int i = 1; i <= 100; i++){
            if (i % 2 == 0){
                System.out.println(i);
            }else {

            }
        }
        System.out.println("---------------");
        System.out.println("");
        System.out.println("Buatlah deret bilangan fibonacci (angka 1-100) !");

        for (int i = 1; i <= 10; i++){
            System.out.println("nilai ke - "+i+", adalah = ");
        }
    }
}
