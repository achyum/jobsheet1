/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet1;

/**
 *
 * @author SMK TELKOM
 */
import java.util.Scanner;
public class pilihanmenu {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        int pilihan=9;
        do{
        System.out.println("\n MENU LUAS BANGUN PERSEGI\n");
        System.out.println("1. menghitung luas persegi");
        System.out.println("2. menghitung luas persegi panjang");
        System.out.println("3. keluar");
        System.out.print("masukkan pilihan anda : ");
        pilihan = masukan.nextInt();
        switch(pilihan){
            case 1 : luaspersegi(); break;
            case 2 : luaspersegipanjang();break;
        }
        }while(pilihan != 3);
    }
    
    private static void luaspersegi(){
    Scanner masukan = new Scanner(System.in);
    float sisi,luas;
    System.out.print("masukkan nilai sisi :");
    sisi = masukan.nextFloat();
    luas = sisi * sisi;
    System.out.println("luas persegi adalah : " + luas);
    }
    
    private static void luaspersegipanjang(){
    Scanner masukan = new Scanner(System.in);
    float panjang,lebar,luas;
    System.out.print("masukkan nilai panjang :");
    panjang = masukan.nextFloat();
    System.out.print("masukkan nilai lebar :");
    lebar = masukan.nextFloat();
    luas = panjang * lebar;
    System.out.println("luas persegi panjang adalah : " + luas);
    }
}
