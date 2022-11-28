
package uts;

import java.util.Scanner;

class Persegipanjang{
    int Panjang;
    int Lebar;
    
    //dipakai dalam penngunaan tertentu
    /*public Persegipanjang(int panjang,int lebar){
        this.Panjang = panjang;
        this.Lebar = lebar;
    }*/
    
    public Persegipanjang(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Panjang           : ");
        Panjang=input.nextInt();
        System.out.print("Masukan Lebar             : ");
        Lebar=input.nextInt();
        
    }
    
    void setPanjang(int P){
        Panjang = P;
    }
    
    void setLebar(int L){
        Lebar = L;
    }
    
    int getPanjang(){
        return Panjang;
    }
    
    int getLebar(){
        return Lebar;
    }
    
    int getKeliling(){
        return 2*(Panjang + Lebar);
    }
    void hasil (){
    System.out.println ("Panjangnya adalah          ="+getPanjang());
    System.out.println ("Lebarnya adalah            ="+getLebar());
    System.out.println ("Jadi Kelilingnya adalah    ="+getKeliling());
   
    }
}

public class SoalSatuopsi2{
    public static void main(String[]args){            
        Persegipanjang kll = new Persegipanjang();
        kll.hasil();   
    }

    
    /*public static void main(String[]args){            
        Persegipanjang kll = new Persegipanjang(12,3);
        kll.hasil();   
    }*/

}

