package uts;
import java.util.Scanner;
public class SoalSatu {
    public static void main(String[] args) {
        Scanner masuk=new Scanner(System.in);

        int panjang, lebar, keliling;
      
        System.out.println("    Menghitung Luas Persegi Panjang    ");
        System.out.println("***************************************\n");

        System.out.print("Masukan Panjang      : ");
        panjang=masuk.nextInt();
        System.out.print("Masukan Lebar        : ");
        lebar=masuk.nextInt();
        
        keliling = 2 *(panjang+lebar);

        System.out.println("\nKeliling dari Persegi panjang");
        System.out.println("Dengan panjang        : " + panjang);
        System.out.println("Dan lebar             : " + lebar);
        System.out.println("Adalah                : " + keliling);
    }  
}
