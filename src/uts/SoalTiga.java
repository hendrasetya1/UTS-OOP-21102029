package uts;
import java.util.Scanner;

//Parent class
class PemainUtama{
    String Nama;
    String Kekuatan; 
    //method
    public void display(){
        System.out.println("Nama pemainnya adalah: "+this.Nama);
        System.out.println("Kekutannya adalah: "+this.Kekuatan);
    }    
}

//subclass
class PemainCadangan extends PemainUtama{
    String Alamat;
    //metohod
    public void tampil(){
        System.out.println("Alamatnya di:"+this.Alamat);
    }
}

public class SoalTiga {
    public static void main(String args[]){
        
        PemainUtama pemain1 = new PemainUtama();
        pemain1.Nama = "Victor";
        pemain1.Kekuatan="Ngeprank pemain lain";
        pemain1.display();
        //----------------------------------------------------
        PemainCadangan pemain2 = new PemainCadangan();
        pemain2.Nama ="Gak Tau";
        pemain2.Kekuatan ="Gak tau juga";
        pemain2.Alamat = "Juga tidak tahu";
        pemain2.display();
        pemain2.tampil();
        //-----------------------------------------------------
        Scanner input = new Scanner(System.in);
        PemainCadangan pemain3 = new PemainCadangan();
        String name;
        String power;
        String address;
        
        System.out.print("Masukkan nama pemain lainnya: ");
        name = input.nextLine();
        System.out.print("Masukkan juga kekutannya: ");
        power = input.nextLine();
        System.out.print("Masukkan juga alamatnya: ");
        address = input.nextLine();
        
        pemain3.Nama =name;
        pemain3.Kekuatan =power;
        pemain3.Alamat = address;
        pemain3.display();
        pemain3.tampil();
    }
}
