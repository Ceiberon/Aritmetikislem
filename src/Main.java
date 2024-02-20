import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c;

        Scanner input = new Scanner(System.in);
       //Sayı değerlerini giriyoruz
        System.out.print("1. Sayıyı giriniz :");
        a = input.nextInt();

        System.out.print("2. Sayıyı giriniz :");
        b = input.nextInt();

        System.out.print("3. Sayıyı giriniz :");
        c = input.nextInt();
        // işlemi yapıyoruz

        int Sonuc = a + (b * c) - b;
        //Sonucu yazdırıyoruz

System.out.println("Sonuc : " + Sonuc);
    }
}